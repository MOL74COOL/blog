package com.songtian.restaurant.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    @GetMapping("/Map")
    public String map(){
        return "menu/Map";
    }
}
