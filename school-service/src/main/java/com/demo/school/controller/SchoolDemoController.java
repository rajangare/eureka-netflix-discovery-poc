package com.demo.school.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/school")
public class SchoolDemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> schoolDemo() {
        return new ResponseEntity<String>("<h2>Welcome to School Service</h2>",HttpStatus.OK);
    }
}
