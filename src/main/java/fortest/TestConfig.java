package fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by durendong on 2017/1/17.
 */
@Configuration
@ComponentScan("fortest")
public class TestConfig {



    @Bean
    @Profile("22222")
    public TestBean getTest2() {
        return new TestBean("22222");
    }
}
