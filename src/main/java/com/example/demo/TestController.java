package com.example.demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class TestController {
    @PostMapping("/")
    public String testPost() {
        return "Ok";
    }
    @GetMapping("/")
    public String testGet(Principal principal) {
        System.out.println("userDetails is "+principal);
        return "index";
    }
}
