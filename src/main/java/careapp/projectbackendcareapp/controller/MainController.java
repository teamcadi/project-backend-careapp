//package careapp.projectbackendcareapp.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class MainController {
//    @GetMapping("signIn") //index.html에서 signIn값을 받으면 이 함수로 처리.get방식으로 받음
//    public String signIn(Model model){
////        model.addAttribute("data","hello"); //parameter 넘겨주고 싶을 때 사용
//        return "signIn"; //view resolver가 return 값인 page로 이동시킴.
//    }
//
//    @GetMapping("logIn")
//    public String logIn(Model model){
//        return "logIn";
//    }
//
//    @PostMapping("signInForm") //post방식으로 받음
//    public String createUser(@RequestParam("ID") String ID, @RequestParam("password") String password, Model model){
////        model.addAttribute("name", name);
//        //database에 유저 정보 저장
////        SignIn signIn = new SignIn();
////        signIn.setUserId(ID);
////        signIn.setPassword(password);
//        return "/";
//    }
//
//    static class SignIn
//    {
//        private String ID;
//        public String getID;
//    }
//
//
//
//}
//
//
