package conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/17.
 */
public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        listService.showname();
        System.out.println(context.getEnvironment().getProperty("os.name"));
    }
}
