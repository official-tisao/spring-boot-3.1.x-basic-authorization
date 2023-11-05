package com.tisao.Spring3SecurityBasicAuth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/health/ping")
    public ResponseEntity<String> pingService(){
        return ResponseEntity.ok().body("Service is Up running...");
    }

    @GetMapping("/")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok().body("Service is Up and running...");
    }
    @GetMapping("/secured")
    public ResponseEntity<String> secured(){
        return ResponseEntity.ok().body("This is basic authentication secured url ...");
    }
    @PostMapping("/post-secured")
    public ResponseEntity<String> postSecured(){
        return ResponseEntity.ok().body("This is basic authentication secured url ...");
    }
}
