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

}
