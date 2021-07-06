package com.example.myspringboot.lxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
