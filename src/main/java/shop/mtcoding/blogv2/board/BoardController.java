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
    public String index() {
        System.out.println("게시글 목록보기 완료");
        return "index";
    }

    // 게시글 글쓰기
    @GetMapping("/board/saveForm")
    public String saveForm() {
        return "/board/saveForm";
    }

    @PostMapping("/board/save")
    public String save() {
        System.out.println("글쓰기 기능 구현완료");
        return "redirect:/";
    }
}
