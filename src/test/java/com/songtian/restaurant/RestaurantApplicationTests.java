package com.songtian.restaurant;

import com.songtian.restaurant.mapper.merchant.managerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestaurantApplicationTests {
    @Autowired
    managerMapper mapper1;
    @Test
    void contextLoads() {
        System.out.println(mapper1);
    }

}
