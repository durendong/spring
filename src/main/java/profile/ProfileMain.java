package profile;

        import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by durendong on 2017/1/16.
 */
public class ProfileMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("old");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
    }
}
