package aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by durendong on 2017/1/16.
 * Aware类型的类和接口里面有很多spring框架自己的东西
 * 如果想要获取这些东西,那么就不可避免的,会和spring框架进行耦合
 * 但是这是实际开发中必然会出现的情况,所以所谓的松耦合也是有条件的
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {

    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outPrint() {
        System.out.println("bean = " + beanName);
        Resource resource = resourceLoader.getResource("classpath:test.txt");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
