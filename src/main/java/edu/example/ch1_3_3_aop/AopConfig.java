package edu.example.ch1_3_3_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author:linzf
 * @since: 2017-03-29.
 * @version:1.0
 * @describe:
 *     @Configuration：表明这是一个配置类,相当于我们的一个外置的xml配置文件。
 *     @ComponentScan("edu.example.ch1_3_3_aop")：表示扫描edu.example.ch1_3_3_aop包底下的
 *     所有@Service、@Component、@Repository、@Controller的类，并注册为Bean。
 *     @EnableAspectJAutoProxy表示开始spring对AspectJ代理的支持。
 */
@Configuration
@ComponentScan("edu.example.ch1_3_3_aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
