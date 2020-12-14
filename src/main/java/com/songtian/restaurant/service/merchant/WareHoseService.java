package com.songtian.restaurant.service.merchant;

import com.songtian.restaurant.bean.merchant.menu;
import com.songtian.restaurant.mapper.merchant.merchantMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WareHoseService {
    @Autowired
    merchantMenuMapper menumapper;

    public List<menu> selectAll() {
        return menumapper.selectAll();
    }
}
