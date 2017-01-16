package aop.aop_ex;

import org.springframework.stereotype.Service;

/**
 * Created by durendong on 2017/1/16.
 */
@Service
public class AnnotationService {

    @AopAction(name = "注解时,注入")
    public void sayHello() {
        System.out.println("注解方法");
    }

}
