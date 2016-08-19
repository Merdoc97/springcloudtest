package com.example.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by artomov.ihor on 06.04.2016.
 */
@RestController
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getResponce() {
        return "From another controller";
    }
}
