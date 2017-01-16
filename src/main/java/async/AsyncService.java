package async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by durendong on 2017/1/17.
 */
@Service
public class AsyncService {

    private int i = 0;

    @Async
    public void executeAsync() {
        System.out.println("执行异步任务:" +i);
    }

    @Async
    public void executAsync2() {
        System.out.println("异步任务+1" +i++);
    }
}
