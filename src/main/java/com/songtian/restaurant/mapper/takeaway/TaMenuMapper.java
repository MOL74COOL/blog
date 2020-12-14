package com.songtian.restaurant.mapper.takeaway;

import com.songtian.restaurant.bean.takeaway.TakeMeun;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TaMenuMapper {
    //查找全部外卖订单 limit限制六条
    @Select("select id,mname,rname,phone,address,takeaway from all_process where phone is not NULL AND takeaway IS NULL LIMIT #{begin},5")
    public List<TakeMeun> selectTakeaway(int begin);
    //更新外卖员的名字
    @Update("UPDATE all_process SET takeaway = #{username} WHERE id = #{id}")
    public void updateTakeaway(String username, String id);
    //按外卖员的名字找外卖订单
    @Select("SELECT * FROM mytakeaway WHERE takeaway = #{username} LIMIT #{begin},5")
    public List<TakeMeun> myTakeawayServlet(String username, int begin);
    //完成外卖订单
    @Delete("DELETE FROM mytakeaway WHERE id = #{id}")
    public void deleteTakeaway(String id);
    //历史订单
    @Select("SELECT * FROM completedtakeaway WHERE takeaway = #{username} LIMIT #{begin},5")
    public List<TakeMeun> oldTaServlet(String username, int begin);

    //查外卖订单数量
    @Select("SELECT COUNT(id) FROM all_process WHERE phone IS NOT NULL AND takeaway IS NULL ")
    public int taNum();
    //查我的外卖订单数量
    @Select("SELECT COUNT(id) FROM mytakeaway WHERE takeaway = #{username}")
    public int myTaNum(String username);
    //查历史订单数量
    @Select("SELECT COUNT(id) FROM completedtakeaway WHERE takeaway = #{username}")
    public int oldTaNum(String username);


}
