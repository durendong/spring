package event.ex_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by durendong on 2017/1/16.
 */
@Component
public class MyPublisher {

    @Autowired
    private ApplicationContext context;

    public void pushlier() {
        context.publishEvent(new MyEvent(this,"我是信息"));
    }
}
