package shop.mtcoding.blogv2.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

 // 회원정보 화면 호출
    @GetMapping("/user/updateForm")
    public String updateForm() {
      
        return "user/updateForm";
    }

}
