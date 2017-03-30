package edu.example.ch2_3_2_bean;

import edu.example.ch2_2_2_springel.ElConfig;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:linzf
 * @since: 2017-03-30.
 * @version:1.0
 * @describe:
 */
public class Ch2_3_2_beanTest {

    static AnnotationConfigApplicationContext content;

    @BeforeClass
    public static void init(){
        content = new AnnotationConfigApplicationContext(PrePostConfig.class);
    }

    @Test
    public void beanTest(){
        BeanWayService beanWayService = (BeanWayService)content.getBean("beanWayService");

    }

}
