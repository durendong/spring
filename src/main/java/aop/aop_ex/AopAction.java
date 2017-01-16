package aop.aop_ex;

/**
 * Created by durendong on 2017/1/16.
 */

import java.lang.annotation.*;

//说明该注解作用于方法中
@Target(ElementType.METHOD)
//声明该注解可以在运行时通过反射获取到,AOP的关键注解
@Retention(RetentionPolicy.RUNTIME)
//声明该注解需要写到javadoc中
@Documented
public @interface AopAction {
    String name();
}
