package careapp.projectbackendcareapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("signIn") //index.html에서 signIn값을 받으면 이 함수로 처리.get방식으로 받음
    public String signIn(Model model){
//        model.addAttribute("data","hello"); //parameter 넘겨주고 싶을 때 사용
        return "signIn"; //view resolver가 return 값인 page로 이동시킴.
    }

    @GetMapping("logIn")
    public String logIn(Model model){
        return "logIn";
    }

}


