package com.example.springbootstudy.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "/index";
    }

    @GetMapping("/one")
    public String One(){
        return "/one";
    }
}
