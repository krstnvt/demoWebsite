package com.example.demo.controllers;

import com.example.demo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    String getView(ModelMap model) {
        return "login";
    }
}
