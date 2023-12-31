package shop.mtcoding.blogv2.reply;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReplyController {
    
    @PostMapping("/reply/{id}/detele")
    public String detele(Integer id){
        System.out.println("댓글 삭제 완료");
        return "redirect:/board/"+id;
    }

    // 댓글 작성하기
    @PostMapping("/save")
    public String replySave(Integer id) {
        System.out.println("댓글 작성 구현완료");
        return "/board/detail" + id;
    }

}
