package com.real.springsecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String loginpage(){
        return "login-page";
    }

    @GetMapping("/protected")
    public String protectedPage(){
        return "protected-page";
    }
}
