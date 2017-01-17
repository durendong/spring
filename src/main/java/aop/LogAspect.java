package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by durendong on 2017/1/16.
 * AOP,面向切面编程,解决了OOP通过继承,接口的方式造成的类和类之间的耦合
 * 面向切面编程,可以理解成,以组合的形式解决这个问题
 * 只需要定义切面点@Pointcut("@annotation(aop.Action)")
 * 然后在方法上添加注解:@After("annotationPointCut()")
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(aop.Action)")
    public void annotationPointCut(){
        //这里写什么都不会执行,这只是一个注明的地方
        System.out.println("切点?");
    };

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截: " + action.name());
    }

    @Before("execution(* aop.DemoMethodService.*(..))")
    public void Before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法式拦截:" + method.getName());
    }
}
