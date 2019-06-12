package com.xxf.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${username}")
    String username;

    @RequestMapping("getUsername")
    public String getUsername() {
        return username;
    }
}
