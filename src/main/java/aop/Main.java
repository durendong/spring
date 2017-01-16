package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/16.
 */
public class Main {

    public  static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = applicationContext.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
        DemoMethodService demoMethodService = applicationContext.getBean(DemoMethodService.class);
        demoMethodService.add();
        applicationContext.close();
    }
}
