package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/17.
 */
public class annotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outprint();
        context.close();
    }
}
