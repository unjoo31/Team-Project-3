package shop.mtcoding.blogv2.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

       // 게시글 삭제
    @PostMapping("/board/delete")
    public String delete() {
       
    return ("/");
    }

    @GetMapping("/")
    public String index(){
        System.out.println("게시글 목록보기 완료");
        return "index";
    }
}
