package edu.example.ch2_3_2_bean;

import org.springframework.stereotype.Service;

/**
 * @author:linzf
 * @since: 2017-03-30.
 * @version:1.0
 * @describe:
 */
public class BeanWayService {

    public void init(){
        System.out.println("init-beanWayService");
    }

    public void destory(){
        System.out.println("destory-beanWayService");
    }

}
