package taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by durendong on 2017/1/17.
 */
@Configuration
@ComponentScan("taskscheduler")
//打开计划任务
@EnableScheduling
public class ScheduledConfig {
}
