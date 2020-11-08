package com.example.demo.controller;

/**
*功能描述:$ 册数$
*@author guyongqi
*@date $
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}

