package com.emmerj.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/greet")
    public String getItinerary(){
        return "Hello World!";
    }
}
