package async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/17.
 */
public class AsyncMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ASyncConfig.class);
        AsyncService asyncService = context.getBean(AsyncService.class);
        for (int i = 0; i < 10; i++) {
            asyncService.executeAsync();
            asyncService.executAsync2();
        }
    }
}
