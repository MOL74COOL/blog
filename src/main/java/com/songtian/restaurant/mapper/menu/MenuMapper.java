package com.songtian.restaurant.mapper.menu;

import com.songtian.restaurant.bean.menu.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper {


   @Select("select name,url from menu")
   @Results(value = {
           @Result(column = "name",property = "name"),
           @Result(column = "url",property = "url")
   })
   public List<Menu> find();
}
