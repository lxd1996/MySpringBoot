package com.example.myspringboot.lxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 刘旭东
 * @date: 2021/7/5
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
