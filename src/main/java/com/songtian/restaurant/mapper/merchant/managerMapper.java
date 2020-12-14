package com.songtian.restaurant.mapper.merchant;

import com.songtian.restaurant.bean.merchant.manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface managerMapper {
    public manager selectById(Integer id);
    public manager selectUser(Integer id,String password);
    public void delete();
}
