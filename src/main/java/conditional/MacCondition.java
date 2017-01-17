package conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by durendong on 2017/1/17.
 * 我们开发中经常会碰到这种情况:
 * 需要某个bean是在满足某些情况下在创建,在spring里面可以这么做
 * 1.通过实现Condition类
 * 2.在matches方法里面写条件
 * 3.具体的实现类里面加入注解:@Conditional(MacCondition.class)
 */
public class MacCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().getProperty("os.name").contains("Mac OS X");
    }
}
