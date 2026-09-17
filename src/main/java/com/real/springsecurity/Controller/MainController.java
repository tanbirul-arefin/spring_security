package com.real.springsecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    private boolean isloging;

    @GetMapping("/login")
    public String loginpage(){

        return "login-page";
    }


    @PostMapping("/login")
    public String dologin(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes ){
        if(username.equals("real") && password.equals("123")){
            isloging = true;
            return "redirect:/protected";
        }
        redirectAttributes.addFlashAttribute("warning","invalid username or password");

        return "redirect:/login";
    }


    @GetMapping("/protected")
    public String protectedPage(){

        if(!isloging){
            return "redirect:/login";
        }
        return "protected-page";
    }
}
