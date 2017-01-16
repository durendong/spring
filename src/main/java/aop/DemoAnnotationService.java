package aop;

import org.springframework.stereotype.Service;

/**
 * Created by durendong on 2017/1/16.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的ADD操作")
    public  void add(){
        System.out.println("注解方法");
    }
}
