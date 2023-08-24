package shop.mtcoding.blogv2._core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;


@Configuration 
public class WebMvcConfig implements WebMvcConfigurer{

    // 정적 리소스의 핸들링을 구성하기 위한 메서드 오버라이드
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);

        registry.addResourceHandler("/images/**") // /images/** 라는 경로의 요청이 들어오면
            .addResourceLocations("file:"+"./images/") // ./images/ 해당 경로로 가서 찾아라
            .setCachePeriod(10) // 캐시기간 : 10초
            .resourceChain(true)
            .addResolver(new PathResourceResolver());
    }  
}
