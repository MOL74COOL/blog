package com.songtian.restaurant.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("menuController")
public class MenuController {
    @GetMapping("/Menu")
    public String Menu(){
        return "menu/Menu";
    }
}
