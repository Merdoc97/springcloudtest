package com.example.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by artomov.ihor on 06.04.2016.
 */
@RestController
public class AnotherController {
    @Value("${message}")
    private String message;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getResponce() {
        return message;
    }
}
