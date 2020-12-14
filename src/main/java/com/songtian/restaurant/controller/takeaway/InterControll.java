package com.songtian.restaurant.controller.takeaway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class InterControll {


    @RequestMapping("/")
    @ResponseBody
    public String bbb(String name, String password, HttpSession session) {

        session.setMaxInactiveInterval(1 * 60);  //设置过期时间以秒为单位，会自动刷新

        System.err.println(name + ' ' + password);

        session.setAttribute("name", name);

        session.setAttribute("password", password);

        Object ob = session.getAttribute("preurl");

        if (ob != null) {
            return ob.toString();
        }

        return "ok";

    }

}
