package aop;

import java.lang.annotation.*;

/**
 * Created by durendong on 2017/1/16.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
