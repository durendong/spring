package async.ex_async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by durendong on 2017/1/17.
 */
@Service
public class MyAsyncService {

    private int i = 0;

    @Async
    public void executeShow() {
        System.out.println("目前的I = " +i);
    }

    @Async
    public void executeAdd() {
        System.out.println("i要增加了" + i);
        i++;
    }

}
