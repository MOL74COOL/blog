package com.songtian.restaurant.config.takeaway;


import com.songtian.restaurant.service.takeaway.Interceptor1;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

@EnableCaching

public class Application implements WebMvcConfigurer {

    @Override

    public void addInterceptors(InterceptorRegistry registry) {

        InterceptorRegistration ir = registry.addInterceptor(new Interceptor1());

        ir.addPathPatterns("/hello","/TaManage","/myTakeaway","/oldTakeaway","/myMessage");
        //ir.excludePathPatterns("/","/login", "/js/**", "/html/**", "/images/**", "/css/**");

    }

}

