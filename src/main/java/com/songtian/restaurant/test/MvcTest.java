package com.songtian.restaurant.test;


import com.songtian.restaurant.mapper.merchant.managerMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MvcTest {
    @Autowired
    managerMapper mapper1;
    @Test
    public void a(){
        System.out.println(mapper1);
    }
}
