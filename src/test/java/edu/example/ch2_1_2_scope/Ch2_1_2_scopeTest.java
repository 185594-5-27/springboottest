package edu.example.ch2_1_2_scope;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by linzf on 2017/3/29.
 */

public class Ch2_1_2_scopeTest {

    static AnnotationConfigApplicationContext content;

    @BeforeClass
    public static void init(){
        content = new AnnotationConfigApplicationContext(ScopeConfig.class);
    }

    @Test
    public void scopeTest(){
        /*
        scope的值为prototype的时候表示每次调用这个实体的时候都回去创建一个bean
         */
        DemoPrototypeService dp1 = (DemoPrototypeService)content.getBean("demoPrototypeService");
        DemoPrototypeService dp2 = (DemoPrototypeService)content.getBean("demoPrototypeService");
/*
        scope的默认值为singleton表示一个spring容器里面只会初始化一个bean
         */
        DemoSingletonService ds1 = (DemoSingletonService)content.getBean("demoSingletonService");
        DemoSingletonService ds2 = (DemoSingletonService)content.getBean("demoSingletonService");
        System.out.println("dp1 is equal to dp2:" + dp1.equals(dp2));
        System.out.println("ds1 is equal to ds2:" + ds1.equals(ds2));
    }

}
