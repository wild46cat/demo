package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FirstController {
    Logger logger = LoggerFactory.getLogger(FirstController.class.getName());

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/myReplyPost")
    public String myReplyPost() {
        return "aabbccdd";
    }

    @RequestMapping("/getMenu")
    public String getMenu() {
        return "getmenu";
    }

}
