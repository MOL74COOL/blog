package com.songtian.restaurant.controller.recommend;

import com.songtian.restaurant.service.recommend.MenuCostNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShowControll {
    @Autowired
    MenuCostNumService mapper;
@RequestMapping("/show")
 public String show() {
    return "recommend/show";
}
    @GetMapping("/selectLow")
    public String selectAll(Model model){
        List list=mapper.selectLow();
        model.addAttribute("menuLowInfo",list);
        return "recommend/show";
    }
    @GetMapping("/Toinfo")
    public String Toinfo(Model model){
        return "recommend/email";
    }
    @PostMapping("/info")
    public String info(@RequestParam("subject")String subject,@RequestParam("text")String text, Model model){
        Boolean msg=mapper.sendMail("2924166627@qq.com",subject,text);
        model.addAttribute("msg",msg);
        return "recommend/show";
    }
}
