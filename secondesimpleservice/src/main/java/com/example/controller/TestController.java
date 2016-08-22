package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  on 15.08.2016.
 */
@RestController
public class TestController {
    @Value("${message}")
    private String word;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getHello(){
        return word;
    }
}
