package edu.example.ch1_3_3_aop;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:linzf
 * @since: 2017-03-29.
 * @version:1.0
 * @describe:注解式拦截的例子
 */
@Service
@RequestMapping(value = "/bussiness/ad")
public class DemoAnnotationService {
    @Action(name="add")
    public void add(){

    }

    @Action(name="remove")
    public void remove(){

    }
}
