package edu.example.ch1;

import org.junit.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

/**
 * Created by linzf on 2017-03-28.
 */
public class Ch1Test  {


    static UseFunctionService useFunctionService;

    /*
       BeforeClass表示测试的时候只执行一次该注解里面的方法,Before表示测试的时候每做一次Test的操作的时候都会执行一次该注解里面的方法
       同理AfterClass和After同BeforeClass和Before效果一样
    */
    @BeforeClass
    public static void init(){
        System.out.println("load first");
        AnnotationConfigApplicationContext content = new AnnotationConfigApplicationContext(DiConfig.class);
        useFunctionService = content.getBean(UseFunctionService.class);
    }

    /*
       若想使用assertEquals方法则需要引入import static org.junit.Assert.*;这样该方法才可以使用.
       若测试用例没有通过我们可以在target的surefire-reports目录底下找到我们的错误的日志文件
     */
    @Test
    public void testUse(){
        System.out.println("testUse");
        //assertEquals("Hello:linzf!", useFunctionService.sayHello("linzf"));
    }

    @Test
    public void testUse2(){
       //assertEquals("Hello:linzf!", useFunctionService.sayHello("linzf!"));
    }

    @After
    public void tearDown(){
        System.out.println("load after");
    }
}
