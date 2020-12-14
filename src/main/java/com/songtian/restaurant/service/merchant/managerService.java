package com.songtian.restaurant.service.merchant;

import com.songtian.restaurant.bean.merchant.manager;
import com.songtian.restaurant.mapper.merchant.managerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class managerService {
    @Autowired
    managerMapper mapper;
    public manager getManager(Integer id,String password) {
        manager one=null;
        one = mapper.selectUser(id,password);
        if(one!=null){
            return one;
        }else {
            throw new RuntimeException("没有该用户");
        }
    }
    @Scheduled(cron = "59 59 23 * * *")
    public void clearData(){
        mapper.delete();
    }
}