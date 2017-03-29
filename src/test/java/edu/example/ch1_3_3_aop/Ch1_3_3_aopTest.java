package edu.example.ch1_3_3_aop;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:linzf
 * @since: 2017-03-29.
 * @version:1.0
 * @describe:
 */
public class Ch1_3_3_aopTest {

    static AnnotationConfigApplicationContext content;

    @BeforeClass
    public static void init(){
        content = new AnnotationConfigApplicationContext(AopConfig.class);
    }

    @Test
    public void testAop(){
        DemoAnnotationService demoAnnotationService = (DemoAnnotationService)content.getBean("demoAnnotationService");
        demoAnnotationService.add();
    }

    @Test
    public void testAopMethod(){
        DemoMethodService demoMethodService = (DemoMethodService)content.getBean("demoMethodService");
        demoMethodService.add();
    }


}
