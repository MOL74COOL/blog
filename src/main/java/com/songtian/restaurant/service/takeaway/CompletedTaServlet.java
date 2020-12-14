package com.songtian.restaurant.service.takeaway;

import com.songtian.restaurant.mapper.takeaway.TaMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class CompletedTaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Autowired
    TaMenuMapper taMenuMapper;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String myId = req.getParameter("myId");
        taMenuMapper.deleteTakeaway(myId);
        req.getRequestDispatcher("/myTakeawayServlet").forward(req, resp);

    }
}
