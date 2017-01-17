package taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

/**
 * Created by durendong on 2017/1/17.
 * 自定义计划执行,可以按时,按月,按日执行
 */
@Service
public class ScheduledTaskService {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 3000)
    public void showTime() {
        System.out.println("每隔3秒显示一次");
    }



}
