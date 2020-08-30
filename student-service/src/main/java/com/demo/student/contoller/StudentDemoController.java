package com.demo.student.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/student")
public class StudentDemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> studentDemo() {
        return new ResponseEntity<String>("<h2>Welcome to Student Service</h2>",HttpStatus.OK);
    }
}
