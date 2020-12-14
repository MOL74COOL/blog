package com.songtian.restaurant.mapper.merchant;

import com.songtian.restaurant.bean.merchant.menu;
import com.songtian.restaurant.bean.merchant.menuShop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface shopMapper {
    public List<menuShop> selectAll();
    public List<menuShop> selectByType(Integer type);

}
