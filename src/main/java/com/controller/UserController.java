package com.controller;

import com.domain.ResultList;
import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@RequestMapping("/homework")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAll")
    public ModelAndView getAll(){
        ResultList resultList = userService.getAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("resultList",resultList);
        modelAndView.setViewName("userList");
        return modelAndView;
    }

}

