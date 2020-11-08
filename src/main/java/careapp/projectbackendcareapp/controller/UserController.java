package careapp.projectbackendcareapp.controller;

import careapp.projectbackendcareapp.service.UserService;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Member;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping(value = "/signInForm")
    public String createForm(UserForm form){
        return "signInForm/createUserForm";

    }
    @PostMapping("/signInForm")
    public String create(UserForm form){
        User user = new User();
        user.setUserId(form.getUserId());
        user.setPassword(form.getPassword());

        userService.join(user); 
        return "redirect:/"; //홈 화면으로 보내기
    }

    
    //조회기능
//    @GetMapping("/users")
//    public String list(Model model){
//        List<User> users = userService.findUsers();
//        model.addAttribute("users",users); //addAttrivute 기억해야한다.
//        return "users/userList";
//
//    }
}
