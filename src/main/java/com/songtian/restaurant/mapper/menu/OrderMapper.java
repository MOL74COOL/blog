package com.songtian.restaurant.mapper.menu;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OrderMapper {

    @Insert("INSERT INTO order1 (name,number,price,totalPrice) VALUES(#{name},#{number},#{price},#{totalPrice})")
    public void insertMenu(String name,String number,String price,int totalPrice);

    @Update("update order1 set name = #{name},number = #{number},price = #{price},totalPrice = #{totalPrice} where name = #{name}")
    public void updateMenu(String number,String price,String name,int totalPrice);

    @Update("update order1 set totalPrice = #{totalMoney},number = #{totalNumber} where id = 6")
    public void updatePrice(int totalMoney,String totalNumber);

    @Update("UPDATE order1 SET number = 0,price =0,totalPrice =0,address = null where id=#{id}")
    public void updateMenu1(int id);

    @Select("select name from menu where id = #{id}")
    public String findById(int id);

    @Select("select MAX(id) from order1")
    public int findByMax();



}


