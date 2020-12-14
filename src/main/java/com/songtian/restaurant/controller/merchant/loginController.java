package com.songtian.restaurant.controller.merchant;

import com.songtian.restaurant.bean.merchant.Msg;
import com.songtian.restaurant.bean.merchant.manager;
import com.songtian.restaurant.service.merchant.managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class loginController {
    @Autowired
    managerService mapper;
    @GetMapping("/mylogin")
    public String login(){
        return "merchant/login";
    }
    @PostMapping("/checkUser")
    public String checkUser(@RequestParam("username")String username, @RequestParam("password")String password, HttpSession session){
        if(session.getAttribute(username)!=null){
            int i= (int) session.getAttribute(username);
            System.out.println(i);
            if(i>3){
                return "merchant/error";
            }
        }
        if(isNumeric(username)){
            manager one=mapper.getManager(Integer.parseInt(username),password);
            if(one!=null){
                session.setAttribute("manager",one);
                return "redirect:/index";
            }
        }
        return "/merchant/login";
    }
    @PostMapping("/myError")
    public String error(@RequestParam("username") String username,HttpServletRequest request){

        if( request.getSession().getAttribute(username)!=null){
            int i= (int) request.getSession().getAttribute(username);
            i++;
            request.getSession().setAttribute(username,i);
        }else{
            request.getSession().setAttribute(username,1);
        }
        return "merchant/error";
    }

    public boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
}
