package com.songtian.restaurant.controller.takeaway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaManageController {
    //抢外卖界面
    @GetMapping("/TaManage")
    public String test() {
        return "takeaway/TaManage";
    }
    //欢迎界面
    @GetMapping("/hello")
    public String test1() {
        return "takeaway/hello";
    }
    //我的外卖界面
    @GetMapping("/myTakeaway")
    public String test2() {
        return "takeaway/myTakeaway";
    }
    //历史订单界面
    @GetMapping("/oldTakeaway")
    public String test3() {
        return "takeaway/oldTakeaway";
    }
    //个人信息界面
    @GetMapping("/myMessage")
    public String test4() {
        return "takeaway/myMessage";
    }
}


