package com.songtian.restaurant.mapper.merchant;

import com.songtian.restaurant.bean.merchant.manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface merchantLogin {
    public manager selectById(Integer id);
}
