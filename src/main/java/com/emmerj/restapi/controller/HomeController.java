package com.emmerj.restapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/greet", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getItinerary(){
        return "Hello World!";
    }
}
