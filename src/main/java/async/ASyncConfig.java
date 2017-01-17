package async;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by durendong on 2017/1/16.
 * spring提供了异步支持,只需要实现AsyncConfigurer接口的方法,设置线程池
 * 然后在线程的方法上添加注解@Async即可
 */
@Configuration
@ComponentScan("async")
//开启异步支持
@EnableAsync
public class ASyncConfig implements AsyncConfigurer {

    //线程池
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return null;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
