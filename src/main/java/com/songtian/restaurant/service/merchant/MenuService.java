package com.songtian.restaurant.service.merchant;
import com.songtian.restaurant.bean.merchant.manager;
import com.songtian.restaurant.bean.merchant.menu;
import com.songtian.restaurant.mapper.merchant.managerMapper;
import com.songtian.restaurant.test.myException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.songtian.restaurant.mapper.merchant.merchantMenuMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    merchantMenuMapper menumapper;
    @Autowired
    managerMapper Managermapper;
    Integer Stockout_MIN=120;

    public List<menu> selectAll(){
        System.out.println();
        return menumapper.selectAll();
    }
    public List<menu> selectStockout(){
        return menumapper.selectStockout(Stockout_MIN);
    }
    public menu seleById(Integer n){
        return menumapper.selectById(n);
    }
    public void buy(Integer id, Integer num, manager person) throws myException {
        menu one=seleById(id);
        Integer priceAll=id*num*one.getPrice();
        person=Managermapper.selectById(person.getId());
        if(person.getSales()-priceAll>=0){
            person.setSales(person.getSales()-priceAll);
            menumapper.updateMenuNumber(id,num);
        }else{
            System.out.println("钱不够");
            throw new myException("钱不够");

        }
    }
    public void deleteMenu(Integer id){
        menumapper.deleteMenu(id);
    }
    public boolean checkMenu(List list_old){
        int sum=0,sun_old=0;
        List<menu> list=selectStockout();
        if(list.size()!=list_old.size()){
            return false;
        }

        for(int i=0;i<list.size();i++){
            menu one=list.get(i);
            menu one_old= (menu) list_old.get(i);
            if(one.getId()!=one_old.getId()){
                return false;
            }
            if (one.getNumber()!=one_old.getNumber()){
                return false;
            }
            sum=sum+one.getNumber();
            sun_old=sun_old+one.getNumber();
        }
        if(sum!=sun_old){
            return false;
        }
        return true;
    }
    public List<menu> selectHot(){
        return null;
    }
}
