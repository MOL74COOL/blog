package com.songtian.restaurant.controller.merchant;

import com.songtian.restaurant.bean.merchant.menu;
import com.songtian.restaurant.bean.merchant.menuShop;
import com.songtian.restaurant.service.merchant.showppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/showpping")
public class showppingController {
    @Autowired
    showppingService ShowppingService;
    @GetMapping("/")
    public String shopIndex(Model model){
        List<menuShop> one;
        Map<Integer,List<menuShop>> map=new HashMap<Integer,List<menuShop>>();
        List<menuShop> list=ShowppingService.selectAll();
        for(int i=0,j;i<list.size();i++){
            j=list.get(i).getM_type();
            one=map.get(j);
            if(one==null){
                    one=new ArrayList<menuShop>();
                    one.add(list.get(i));
                    map.put(j,one);
            }else{
                one.add(list.get(i));
            }

        }
        model.addAttribute("showMenu",map);
        return "merchant/showpping";
    }
}
