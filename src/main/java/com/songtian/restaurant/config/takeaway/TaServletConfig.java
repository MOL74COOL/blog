package com.songtian.restaurant.config.takeaway;

import com.songtian.restaurant.service.takeaway.*;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaServletConfig {
    //找外卖
    @Bean
    public ServletRegistrationBean getServlet(TaMenuServlet taMenuServlet){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(taMenuServlet,"/taMenuServlet");
        return registrationBean;
    }
    //抢外卖
    @Bean
    public ServletRegistrationBean getServlet1(UpdateTaServlet updateTaServlet){
        ServletRegistrationBean<UpdateTaServlet> registrationBean = new ServletRegistrationBean<>(updateTaServlet, "/updateTaServlet");
        return registrationBean;
    }
    //找自己的外卖
    @Bean
    public ServletRegistrationBean getServlet2(MyTakeawayServlet myTakeawayServlet){
        ServletRegistrationBean<MyTakeawayServlet> registrationBean = new ServletRegistrationBean<>(myTakeawayServlet, "/myTakeawayServlet");
        return registrationBean;
    }

    //送达外卖订单
    @Bean
    public ServletRegistrationBean getServlet3(CompletedTaServlet completedTaServlet){
        ServletRegistrationBean<CompletedTaServlet> registrationBean = new ServletRegistrationBean(completedTaServlet, "/completedTaServlet");
        return registrationBean;

    }

    //历史订单
    @Bean
    public ServletRegistrationBean getServlet4(OldTaServlet oldTaServlet){
        ServletRegistrationBean<OldTaServlet> registrationBean = new ServletRegistrationBean<>(oldTaServlet, "/oldTaServlet");
        return registrationBean;

    }

    //注销session
    @Bean
    public ServletRegistrationBean getServlet5(ExitServlet exitServlet){
        ServletRegistrationBean<ExitServlet> registrationBean = new ServletRegistrationBean(exitServlet, "/exitServlet");
        return registrationBean;

    }
}
