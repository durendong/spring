package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by durendong on 2017/1/16.
 * 我们经常会碰到一种情况,开发环境和部署环境是不一致的,比如数据库配置
 * 那么spring提供了Profile注解,用于解决这个问题,可以随时切换,而不用去改配置文件
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("new")
    public DemoBean getDemoBean() {
        return new DemoBean("这是新服务器");
    }

    @Bean
    @Profile("old")
    public DemoBean getOldDemobean() {
        return new DemoBean("这是老的服务器");
    }
}
