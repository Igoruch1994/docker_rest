package com.example.restdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class.getName());

    private RestTemplate restTemplate;

    public DemoController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping(value = "/demo")
    public String getUsers() {
        return "Hello eto oospeh";
    }

}
