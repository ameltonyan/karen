package com.example.karen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", welcomeMessage);
        return "greeting";
    }

}
