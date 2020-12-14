package com.songtian.restaurant.service.merchant;

import com.songtian.restaurant.bean.merchant.menu;
import com.songtian.restaurant.bean.merchant.menuShop;
import com.songtian.restaurant.mapper.merchant.shopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class showppingService {
    @Autowired
    shopMapper shop;

    public List<menuShop> selectAll() {
        return shop.selectAll();
    }
    public List<menuShop> selectByType(Integer type) {
        return shop.selectByType(type);
    }
}
