package com.songtian.restaurant.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class indexController {
    @GetMapping("/index")
    public String index(){
        return "menu/index";
    }
}
