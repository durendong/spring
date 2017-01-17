package event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by durendong on 2017/1/16.
 * 事件发布类
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext context;
    public void publish(String msg) {
        context.publishEvent(new DemoEvent(this,msg));
    }
}
