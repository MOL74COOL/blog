package com.songtian.restaurant.mapper.recommend;

import com.songtian.restaurant.bean.recommend.Recommend;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RecommendMapper {

    @Select("SELECT  order1.`name`,menu.`url`,COUNT(*) 'number' FROM order1,menu \n" +
            "WHERE order1.`name`=menu.`name`\n" +
            "GROUP BY NAME \n" +
            "ORDER BY  number DESC ")
    public List<Recommend> selectNum();

    @Select("SELECT  DISTINCT order1.`name`,menu.`url`,price 'number' FROM order1,menu \n" +
            "WHERE order1.`name`=menu.`name`\n" +
            "ORDER BY  number ASC")
    public List<Recommend> selectLow();
}
