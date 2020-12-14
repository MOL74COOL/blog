package com.songtian.restaurant.controller.merchant;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.songtian.restaurant.bean.merchant.Msg;
import com.songtian.restaurant.bean.merchant.manager;
import com.songtian.restaurant.bean.merchant.menu;
import com.songtian.restaurant.service.merchant.MenuService;
import com.songtian.restaurant.test.myException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller("merchantController")
public class MenuController {

    @Autowired
    MenuService menuService;

    private PageInfo page;

    @GetMapping("/seleAll")
    @ResponseBody
    public String selectById(){
        System.out.println();
        menuService.selectAll();
        return "ok";
    }

    @GetMapping("/index")
    public String selectStockout(@RequestParam(value = "pn",defaultValue = "1")Integer pn, HttpSession session,Model model){
        manager one= (manager) session.getAttribute("manager");
        if(one==null){
            return "/merchant/login";
        }

        //外卖员添加
        else if (one.getRole().equals("外卖员")){
            session.setAttribute("user",one);
            return "/takeaway/hello";
        }
        //外卖员添加结束

        PageHelper.startPage(pn,5);
        page=new PageInfo(menuService.selectStockout(),5);
        model.addAttribute("pageInfo",page);
        if(session.getAttribute("user")==null)
            model.addAttribute("user",one);
        return "merchant/index";
    }

    @GetMapping("/insertMenu")
    public String insertMenu(@RequestParam("insertNum") Integer insertNum,@RequestParam("insertId") Integer insertId,HttpServletRequest request){
        try {
            //menuService.buy(num,id, (manrager) model.getAttribute("me"));
            manager one= (manager) request.getSession().getAttribute("manager");
            if(insertNum<=0){
                throw  new myException("你不能输入负数啊，大佬");
            }
            menuService.buy(insertId,insertNum, one);
            request.getSession().setAttribute("msg","ojerk");
        }catch (myException e){
            request.getSession().setAttribute("msg",e.getMessage());
        }
        return "redirect:/index";
    }
    @GetMapping("deleteMenu")
    public String deleteMenu(@RequestParam("insertId")Integer id){
        menuService.deleteMenu(id);
        return "redirect:/index";
    }

    @RequestMapping("/checkMenu")
    @ResponseBody
    public Msg chekMenu(){
        List list;
        if(page!=null)
            list=page.getList();
        else
            list=new ArrayList();
        System.out.println("start");
        if(menuService.checkMenu(list)){
            return Msg.seccess();
        }
        return Msg.fail();
    }


    @GetMapping("/test")
    @ResponseBody
    public Msg test(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
        PageHelper.startPage(pn,5);
        PageInfo page=new PageInfo(menuService.selectStockout(),5);

        model.addAttribute("pageInfo",page);
        System.out.println("end");
        return Msg.seccess().add("pageInfo",page);
    }

    @GetMapping("/checkUser")
    @ResponseBody
    public String checkUser(HttpSession session, Model model){
        System.out.println(model.getAttribute("username"));
        System.out.println(model.getAttribute("password"));
        return "ok";
    }

    @GetMapping("/")
    public String myLogin(){
        menuService.selectAll();

        return "merchant/login";
    }
}
