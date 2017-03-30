package edu.example.ch2_3_2_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author:linzf
 * @since: 2017-03-30.
 * @version:1.0
 * @describe:
 */
@Configuration
@ComponentScan("edu.example.ch2_3_2_bean")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
}
