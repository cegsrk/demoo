package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(Democontroler.BASE_URL)
public class Democontroler {
    public static final String BASE_URL = "/democontroler.svc/api/v1";


    @PostMapping("/sendExpiringCertificates")
    public String saveUser() {
        // Implement
        System.out.println("Connection to HANA successful!");
        return "completed";
    }
}
