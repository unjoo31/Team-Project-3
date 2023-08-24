package shop.mtcoding.blogv2._core.error;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import shop.mtcoding.blogv2._core.error.ex.MyApiException;
import shop.mtcoding.blogv2._core.error.ex.MyException;
import shop.mtcoding.blogv2._core.util.ApiUtil;
import shop.mtcoding.blogv2._core.util.Script;

// 예외처리용 핸들러
@RestControllerAdvice
public class MyExceptionHandler {
    
    // JavaScript 응답용
    @ExceptionHandler(MyException.class)
    public String error(MyException e){
        return Script.back(e.getMessage());
    }

    // JSON 응답용
    @ExceptionHandler(MyApiException.class)
    public ApiUtil <String> error(MyApiException e){
        return new ApiUtil<String>(false, e.getMessage());
    }
}
