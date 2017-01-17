package event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by durendong on 2017/1/16.
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
}
