package com.example.controller;

/**
 * Created by wq on 2016/9/29.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public String hello(){
        System.out.println("into index method");
        return "forward://index.html";
    }
}
