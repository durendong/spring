package taskscheduler.ex_task;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by durendong on 2017/1/17.
 */
@Configuration
@ComponentScan("taskscheduler.ex_task")
@EnableScheduling
public class TaskConfig {
}
