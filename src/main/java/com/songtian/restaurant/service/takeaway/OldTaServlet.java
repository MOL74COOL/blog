package com.songtian.restaurant.service.takeaway;

import com.songtian.restaurant.bean.merchant.manager;
import com.songtian.restaurant.bean.takeaway.TakeMeun;
import com.songtian.restaurant.mapper.takeaway.TaMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class OldTaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Autowired
    TaMenuMapper taMenuMapper;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        manager user = (manager) req.getSession().getAttribute("user");

        int oldTaNum = taMenuMapper.oldTaNum(user.getRname());

        // 如果req没有传值则默认显示第一页
        int page = (req.getParameter("page") == null ? 1 : Integer.parseInt(req.getParameter("page")));

        if(page <= 0)
            page=1;
            //超页数显示最后一页
        else if(oldTaNum/5+1 < page)
            page=oldTaNum/5+1;
        req.setAttribute("page",page);
        int p = (page - 1) * 5;

        List<TakeMeun> oldTakeaways = taMenuMapper.oldTaServlet(user.getRname() ,0);
        req.getSession().setAttribute("oldTakeaways",oldTakeaways);
        req.setAttribute("oldTaNum",oldTaNum);
        req.getRequestDispatcher("/oldTakeaway").forward(req,resp);
    }
}
