package edu.example.ch2_2_2_springel;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by linzf on 2017/3/29.
 */
public class Ch2_2_2_springelTest {
    static AnnotationConfigApplicationContext content;

    @BeforeClass
    public static void init(){
        content = new AnnotationConfigApplicationContext(ElConfig.class);
    }
    @Test
    public void springelTest(){
        ElConfig ef = (ElConfig)content.getBean("elConfig");
        ef.outPrintln();
    }
}
