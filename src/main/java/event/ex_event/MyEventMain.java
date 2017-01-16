package event.ex_event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/16.
 */
public class MyEventMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyEventConfig.class);
        MyPublisher myPublisher = context.getBean(MyPublisher.class);
        myPublisher.pushlier();
        context.close();
    }
}
