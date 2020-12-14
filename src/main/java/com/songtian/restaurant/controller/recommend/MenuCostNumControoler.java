package com.songtian.restaurant.controller.recommend;

import com.songtian.restaurant.service.recommend.MenuCostNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/recommend")
public class MenuCostNumControoler {
    @Autowired
    MenuCostNumService mapper;
    @GetMapping("/selectAll")
    public String selectAll(Model model){
        List list=mapper.selectAll();
        model.addAttribute("menuInfo",list);
        return "recommend/recommend";
    }
}
