package com.easybytes.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String welcome() {
        return "Hello welcome to spring boot world";
    }
}
