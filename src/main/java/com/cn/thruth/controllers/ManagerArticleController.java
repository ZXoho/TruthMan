package com.cn.thruth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/manager/article")
public class ManagerArticleController {

    @GetMapping("/add")
    public ModelAndView add(){

        return new ModelAndView("/article/add");

    }

}
