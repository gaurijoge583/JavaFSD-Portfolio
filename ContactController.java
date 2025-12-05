package com.portfolio.controller;

import com.portfolio.model.ContactMessage;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin("*")
public class ContactController {

    @PostMapping
    public String sendMessage(@RequestBody ContactMessage msg) {
        System.out.println("New message from: " + msg.getEmail());
        return "Message received successfully!";
    }
}
