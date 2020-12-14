package com.songtian.restaurant.config.menu;

import com.songtian.restaurant.service.menu.IndexServlet;
import com.songtian.restaurant.service.menu.MapServlet;

import com.songtian.restaurant.service.menu.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean getServlet(MyServlet myServlet){
        ServletRegistrationBean<MyServlet> registrationBean = new ServletRegistrationBean<>(myServlet, "/myServlet");
        return registrationBean;
    }
    @Bean
   public ServletRegistrationBean getServlet2(MapServlet mapServlet){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean<>(mapServlet, "/mapServlet");
        return servletRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean getServlet3(IndexServlet indexServlet){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean<>(indexServlet, "/indexServlet");
        return servletRegistrationBean;
    }
}
