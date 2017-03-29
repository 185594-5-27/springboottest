package edu.example.ch1_3_3_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author:linzf
 * @since: 2017-03-29.
 * @version:1.0
 * @describe: 编写切面规则
 *       @Aspect表明这个类是一个是一个切面。
 *       @Component表示会扫描成为一个Bean。
 *       @Pointcut表示注解式声明的切点。
 *       @After表示注解式声明的建言。
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(edu.example.ch1_3_3_aop.Action)")
    public void annotionPointCut() {

    }

    @After("annotionPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("method name:" + action.name()+" annotationType:"+action.annotationType());
    }

    @Before("execution(* edu.example.ch1_3_3_aop.DemoMethodService.*(..))")
    public void  before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("method name:"+method.getName());
    }

}
