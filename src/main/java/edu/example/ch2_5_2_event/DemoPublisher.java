package edu.example.ch2_5_2_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by linzf on 2017/3/30.
 */
@Component
public class DemoPublisher {

    @Autowired
    public ApplicationContext applicationContext;

    /**
     *
     * 实现spring的事件我们需要如下的条件
     * 一、首先我们需要编写继承一个ApplicationEvent的类，通过这个类来作为通知的实体。
     * 二、接着写一个监听我们需要实现ApplicationListener接口，该接口中onApplicationEvent方法来实现具体的监听的方法。
     * 三、再写一个我们的发布类，该类中调用applicationContext.publishEvent方法来进行监听的通知。
     * 通过spring的这个特性，我们可以来进行某些方法的监听。
     *
     */
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
