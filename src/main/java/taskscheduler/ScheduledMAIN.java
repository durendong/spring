package taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/17.
 */
public class ScheduledMAIN {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
        ScheduledTaskService taskService = context.getBean(ScheduledTaskService.class);
        taskService.showTime();
        //context.close();
    }
}
