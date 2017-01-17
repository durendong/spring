package async.ex_async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/17.
 */
public class MyAsyncMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAsyncConfig.class);
        MyAsyncService myAsyncService = context.getBean(MyAsyncService.class);
        for (int i = 0; i <10; i++) {
            myAsyncService.executeShow();
            myAsyncService.executeAdd();
        }
    }
}
