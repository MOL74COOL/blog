package com.songtian.restaurant.service.menu;


import com.songtian.restaurant.bean.menu.Menu;
import com.songtian.restaurant.mapper.menu.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class IndexServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Autowired
    MenuMapper menuMapper;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Menu> menus = menuMapper.find();

        Menu menu=menus.get(0);
        req.getSession().setAttribute("menu",menu);
        Menu menu1=menus.get(1);
        req.getSession().setAttribute("menu1",menu1);
        Menu menu2=menus.get(2);
        req.getSession().setAttribute("menu2",menu2);
        Menu menu3=menus.get(3);
        req.getSession().setAttribute("menu3",menu3);
        Menu menu4=menus.get(4);
        req.getSession().setAttribute("menu4",menu4);
        req.getRequestDispatcher("/menu/index").forward(req,resp);
    }
}
