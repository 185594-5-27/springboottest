package edu.example.ch2_5_2_event;

import edu.example.ch2_3_2_bean.BeanWayService;
import edu.example.ch2_3_2_bean.PrePostConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by linzf on 2017/3/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {EventConfig.class,PrePostConfig.class})
public class Ch2_5_2_eventTest {

    /*
    引入了spring4的Junit使用@ContextConfiguration(classes = {EventConfig.class})直接引入EventConfig里的配置
    在测试的时候只需要引入我们想要的配置的class就可以直接使用里面的实体bean,无须再去初始化AnnotationConfigApplicationContext对象
     */
    @Autowired
    private DemoPublisher demoPublisher;

    @Autowired
    private BeanWayService beanWayService;

    @Test
    public void Test(){
        demoPublisher.publish("jon this your job!");
        beanWayService.destory();
    }
}
