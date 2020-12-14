package com.songtian.restaurant.mapper.menu;


import com.songtian.restaurant.bean.menu.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
  @Update("update order1 set username = #{username},phoneNumber=#{phoneNumber} where id = #{id}")
  public void updateUser(String username,String phoneNumber,int id);

}
