package aop;

import org.springframework.stereotype.Service;

/**
 * Created by durendong on 2017/1/16.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("一般方法");
    }
}
