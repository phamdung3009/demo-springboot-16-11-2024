package demo.spring.boot.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationAutowired {
    @Autowired
    AnnotationCommponent annotationCommponent;
}
/*
@Autowired được sử dụng để tiêm (inject) các dependency vào các thành phần khác.
Khi bạn đánh dấu một thuộc tính bằng @Autowired, Spring Boot sẽ tự động tiêm một
instance của  dependency tương ứng vào thuộc tính đó.*/
