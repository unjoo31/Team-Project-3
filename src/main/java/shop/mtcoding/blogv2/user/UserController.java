package shop.mtcoding.blogv2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/loginForm")
    public String loginForm(){
        System.out.println("로그인 페이지 완료");
        return "/loginForm";
    } 

    @PostMapping("/login")
    public String login(){
        System.out.println("로그인 구현 완료");
        return "redirect:/";
    }

}
