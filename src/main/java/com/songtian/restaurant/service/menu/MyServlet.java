package com.songtian.restaurant.service.menu;


import com.songtian.restaurant.bean.menu.Menu;
import com.songtian.restaurant.mapper.menu.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@Service
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Autowired
    OrderMapper orderMapper;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*for (int i=1;i<=5;i++){
            orderMapper.updateMenu1(i);
        }*/
        String name1=orderMapper.findById(1);
        String name2=orderMapper.findById(2);
        String name3=orderMapper.findById(3);
        String name4=orderMapper.findById(4);
        String name5=orderMapper.findById(5);
        req.setCharacterEncoding("UTF-8");
        String number1 = req.getParameter("1");
        String number2 = req.getParameter("2");
        String number3 = req.getParameter("3");
        String number4 = req.getParameter("4");
        String number5 = req.getParameter("5");

        String price1 = req.getParameter("sum_price1");
        String price2 = req.getParameter("sum_price2");
        String price3 = req.getParameter("sum_price3");
        String price4 = req.getParameter("sum_price4");
        String price5 = req.getParameter("sum_price5");
        String totalNumber=req.getParameter("totalNumber");

        req.getSession().setAttribute("totalNumber",totalNumber);

        if(price1!=""){
            Integer totalPrice1=parseInt(number1)*parseInt(price1.substring(1));
            Menu menu1 = new Menu(name1,number1,price1,"",totalPrice1 );
            if (menu1.getNumber()!=null){
                orderMapper.insertMenu(menu1.getName(),menu1.getNumber(),menu1.getPrice(),menu1.getTotalPrice());
            }
        }
        if(price2!=""){
            Integer totalPrice2=parseInt(number2)*parseInt(price2.substring(1));
            Menu menu2 = new Menu(name2,number2,price2,"",totalPrice2);
            if(menu2.getNumber()!=null){
                orderMapper.insertMenu(menu2.getName(),menu2.getNumber(),menu2.getPrice(),menu2.getTotalPrice());
            }
        }
        if(price3!=""){

            Integer totalPrice3=parseInt(number3)*parseInt(price3.substring(1));
            Menu menu3 = new Menu(name3,number3,price3,"",totalPrice3);
            if(menu3.getNumber()!=null){
                orderMapper.insertMenu(menu3.getName(),menu3.getNumber(),menu3.getPrice(),menu3.getTotalPrice());
            }
        }
        if(price4!=""){

            Integer totalPrice4=parseInt(number4)*parseInt(price4.substring(1));
            Menu menu4 = new Menu(name4,number4,price4,"",totalPrice4);
            if(menu4.getNumber()!=null){
                orderMapper.insertMenu(menu4.getName(),menu4.getNumber(),menu4.getPrice(),menu4.getTotalPrice());
            }
        }
        if(price5!=""){

            Integer totalPrice5=parseInt(number5)*parseInt(price5.substring(1));
            Menu menu5 = new Menu(name5,number5,price5,"",totalPrice5);
            if(menu5.getNumber()!=null){
                orderMapper.insertMenu(menu5.getName(),menu5.getNumber(),menu5.getPrice(),menu5.getTotalPrice());
            }
        }

        resp.sendRedirect("/Map");
    }
}
