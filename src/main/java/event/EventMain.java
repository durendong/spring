package event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/16.
 */
public class EventMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("test");
        context.close();
    }
}
