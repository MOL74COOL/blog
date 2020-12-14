package com.songtian.restaurant.service.takeaway;


import com.songtian.restaurant.bean.merchant.manager;
import com.songtian.restaurant.mapper.takeaway.TaMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class UpdateTaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Autowired
    TaMenuMapper taMenuMapper;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        manager user = (manager) req.getSession().getAttribute("user");

        String id = req.getParameter("id");
        taMenuMapper.updateTakeaway(user.getRname(),id);

        req.getRequestDispatcher("/taMenuServlet").forward(req, resp);


    }
}
