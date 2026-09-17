package com.real.springsecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @GetMapping({"/","/login"})
    public String logindPage(){
        return "login-page";
    }

    @GetMapping("/protected")
    public String protectedPage(){
        return "protected-page";
    }
}
