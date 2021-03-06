package edu.example.ch1_3_3_aop;

import java.lang.annotation.*;

/**
 * @author:linzf
 * @since: 2017-03-29.
 * @version:1.0
 * @describe:实现注解式拦截的类,注解本身是没有功能的,和XML一样都是元数据。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
