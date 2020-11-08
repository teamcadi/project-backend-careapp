package careapp.projectbackendcareapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") //도메인 첫번째 localhost 8080으로 들어오면 이것 호출된다.
    public String home(){
        return "main"; //main.html 호출
    }

}
