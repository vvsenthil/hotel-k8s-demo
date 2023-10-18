package com.k8s.hotelk8sdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Mr Senthil";
    }
}
