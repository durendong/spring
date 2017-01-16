package aop.aop_ex;

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
 */
@Aspect
@Component
public class ExAspect {

    @Pointcut("@annotation(aop.aop_ex.AopAction)")
    public void test(){}

    @Before("test()")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AopAction action = method.getAnnotation(AopAction.class);
        System.out.println(action.name());
    }


    @After("execution(* aop.aop_ex.MothodService.*(..))")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.getName());
    }

}
