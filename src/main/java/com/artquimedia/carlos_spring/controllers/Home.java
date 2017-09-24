package com.artquimedia.carlos_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pezpc on 9/24/17. ***
 */

@Controller
public class Home {


    @GetMapping
    @RequestMapping({"", "/", "/index"})
    public String home(){

        return "index";
    }
}
