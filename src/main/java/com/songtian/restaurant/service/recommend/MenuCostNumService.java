package com.songtian.restaurant.service.recommend;

import com.songtian.restaurant.bean.recommend.Recommend;
import com.songtian.restaurant.bean.recommend.recommendLow;
import com.songtian.restaurant.mapper.recommend.RecommendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuCostNumService {
    @Autowired
    private JavaMailSenderImpl mailSender;
    @Value("${spring.mail.username}")
    private String from;
    @Autowired
    RecommendMapper mapper;
    public List<Recommend> selectAll() {
        List list=mapper.selectNum();
        return list;
    }


    public List<recommendLow> selectLow() {
        List list=mapper.selectLow();
        return list;
    }
    public boolean sendMail(String to,String info,String subject){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo(to);
        message.setFrom(from);
        message.setSubject(subject);
        message.setText(info);
        try{
            mailSender.send(message);
            System.out.println("mes ok");
            return true;
        }catch (MailException e){
            e.printStackTrace();
            return false;
        }

    }
}
