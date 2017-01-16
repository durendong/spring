package aop.aop_ex;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by durendong on 2017/1/16.
 */
@Configuration
@ComponentScan("aop.aop_ex")
@EnableAspectJAutoProxy
public class ExAopConfig {
}
