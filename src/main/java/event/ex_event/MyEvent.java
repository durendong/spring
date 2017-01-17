package event.ex_event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by durendong on 2017/1/16.
 */
public class MyEvent extends ApplicationEvent {

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public MyEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
}
