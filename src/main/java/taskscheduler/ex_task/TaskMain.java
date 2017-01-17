package taskscheduler.ex_task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/17.
 */
public class TaskMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);
        TaskService taskService = context.getBean(TaskService.class);
        taskService.showTime();
    }
}
