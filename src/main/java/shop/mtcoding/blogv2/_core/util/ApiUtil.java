package shop.mtcoding.blogv2._core.util;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ApiUtil<T> {
    // 댓글작성 완료 후 응답의 객체를 만든다
    private boolean sucuess; // true
    private T data; // 댓글쓰기 성공

    public ApiUtil(boolean sucuess, T data) {
        this.sucuess = sucuess;
        this.data = data;
    }   
}
