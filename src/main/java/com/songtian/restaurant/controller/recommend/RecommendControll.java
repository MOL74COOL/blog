package com.songtian.restaurant.controller.recommend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class RecommendControll {
    @Autowired
    RecommendControll recommendMapper;

    public String recommendMapper(Model m){
                return "recommend";
    }

}



