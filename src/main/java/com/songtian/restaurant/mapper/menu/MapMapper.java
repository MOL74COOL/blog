package com.songtian.restaurant.mapper.menu;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MapMapper {
    @Update("update order1 set address = #{address} where id = #{id}")
    public void updateAddress(String address,int id);

    @Delete("Delete from user")
    public void deleteUser();


    @Insert("insert into user(username,phoneNumber) values(#{username},#{phoneNumber})")
    public void insertUser(String username,String phoneNumber);
}
