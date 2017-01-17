package conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by durendong on 2017/1/17.
 */
@Configuration
@ComponentScan("conditional")
public class ConditionConfig {

    @Bean
    @Conditional(MacCondition.class)
    public ListService getMacListService() {
        return new MacListService();
    }


    @Bean
    @Conditional(WindowsCondition.class)
    public ListService getwindowslistService() {
        return new WindowsListService();
    }


}
