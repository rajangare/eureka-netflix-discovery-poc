package com.demo.eureka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discovery")
public class DiscoveryDemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> discoveryDemo() {
        return new ResponseEntity<>("Welcome to <h2>Eureka Discovery Service !</h2>", HttpStatus.OK);
    }
}
