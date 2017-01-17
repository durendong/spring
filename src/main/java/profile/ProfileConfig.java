package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by durendong on 2017/1/16.
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
