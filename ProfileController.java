package com.portfolio.controller;

import com.portfolio.model.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin("*")
public class ProfileController {

    @GetMapping
    public Profile getProfile() {
        return new Profile(
                "Gauri Joge",
                "Full Stack Developer",
                "gaurijoge11@gmail.com",
                "https://github.com/gaurijoge583",
                "https://www.linkedin.com/in/gauri-joge-a79a80305/"
        );
    }
}
