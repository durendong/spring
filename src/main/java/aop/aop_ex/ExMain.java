package aop.aop_ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/16.
 */
public class ExMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExAopConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        MothodService mothodService = context.getBean(MothodService.class);
        annotationService.sayHello();
        mothodService.sayHello();
        context.close();
    }
}
