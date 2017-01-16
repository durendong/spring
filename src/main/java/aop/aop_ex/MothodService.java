package aop.aop_ex;

import org.springframework.stereotype.Service;

/**
 * Created by durendong on 2017/1/16.
 */
@Service
public class MothodService {

    public void sayHello() {
        System.out.println("好好说话");
    }

}
