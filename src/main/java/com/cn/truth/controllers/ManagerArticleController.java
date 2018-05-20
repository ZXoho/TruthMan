package com.cn.truth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/manager/article")
public class ManagerArticleController {

    @GetMapping("/add")
    public String add(){
        return "add";
    }

}
