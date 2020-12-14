package com.songtian.restaurant.service.menu;


import com.songtian.restaurant.mapper.menu.MapMapper;
import com.songtian.restaurant.mapper.menu.OrderMapper;
import com.songtian.restaurant.mapper.menu.UserMapper;
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
public class MapServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Autowired
    MapMapper mapMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UserMapper userMapper;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String city=req.getParameter("City");
        String area=req.getParameter("Area");
        String address=req.getParameter("Address");
        String username=req.getParameter("username");
        String phoneNumber=req.getParameter("phoneNumber");
        int id=orderMapper.findByMax();
        String totalNumber=(String) req.getSession().getAttribute("totalNumber");
        Integer Number = parseInt(totalNumber);
        for (int i=0;i<Number;id--,i++){
            mapMapper.updateAddress(city+area+address,id);
            userMapper.updateUser(username,phoneNumber,id);
        }
        resp.sendRedirect("/Menu");
    }
}
