package com.songtian.restaurant.mapper.merchant;

import com.songtian.restaurant.bean.merchant.menu;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface merchantMenuMapper {
    public List<menu> selectAll();
    public menu selectById(Integer id);
    public List<menu> selectStockout(Integer number);
    public boolean updateMenuNumber(Integer id,Integer number);
    public boolean deleteMenu(Integer id);
    public boolean insertMenu();
    public List<menu> selectHot();

}
