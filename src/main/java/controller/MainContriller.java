package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContriller {
    @GetMapping("signIn")
    public String signIn(Model model){
        return "signIn";
    }

    @GetMapping("logIn")
    public String logIn(Model model){
        return "logIn";
    }

}


