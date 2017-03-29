package edu.example.ch1_3_3_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author:linzf
 * @since: 2017-03-29.
 * @version:1.0
 * @describe:
 */
@Configuration
@ComponentScan("edu.example.ch1_3_3_aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
