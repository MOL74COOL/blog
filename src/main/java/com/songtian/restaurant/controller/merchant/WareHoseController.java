package com.songtian.restaurant.controller.merchant;

import com.github.pagehelper.PageInfo;
import com.songtian.restaurant.bean.merchant.menu;
import com.songtian.restaurant.service.merchant.WareHoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller()
@RequestMapping("/wareHouse")
public class WareHoseController {
    @Autowired
    WareHoseService wareHoseService;
    @GetMapping("/")
    public String selectById(Model model){

        List<menu> allMenu= wareHoseService.selectAll();
        PageInfo wareInfo=new PageInfo(allMenu);
        model.addAttribute("wareInfo",wareInfo);
        System.out.println("a");
        return "merchant/wareHouse";
    }
}
