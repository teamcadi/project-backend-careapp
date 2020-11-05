package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContriller {
    @GetMapping("signIn") //index.html에서 signIn값을 받으면 이 함수로 처리
    public String signIn(Model model){
        return "../templates/signIn";
    }

    @GetMapping("logIn")
    public String logIn(Model model){
        return "../templates/logIn";
    }

}


