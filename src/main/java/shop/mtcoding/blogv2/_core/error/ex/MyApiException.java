package shop.mtcoding.blogv2._core.error.ex;

// JSON 응답용
public class MyApiException extends RuntimeException{
    public MyApiException(String message){
        super(message);
    }
}
