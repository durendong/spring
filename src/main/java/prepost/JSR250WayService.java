package prepost;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by durendong on 2017/1/16.
 */
@Service
public class JSR250WayService {

    @PostConstruct
    public void init() {
        System.out.println("这是初始化方法");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("这是销毁方法");
    }
}
