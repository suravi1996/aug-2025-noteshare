package com.notes.noteshare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot is running!";
    }
}
