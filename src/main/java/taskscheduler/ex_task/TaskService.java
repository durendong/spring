package taskscheduler.ex_task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by durendong on 2017/1/17.
 */
@Service
public class TaskService {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

    @Scheduled(fixedDelay = 3000)
    public void showTime() {
        System.out.println("当前时间:" + dateFormat.format(new Date()));
    }


}
