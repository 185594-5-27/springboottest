package edu.example.ch2_5_2_event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by linzf on 2017/3/30.
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
}
