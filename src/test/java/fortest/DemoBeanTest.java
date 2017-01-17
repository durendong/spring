package fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by durendong on 2017/1/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@ActiveProfiles("22222")
public class DemoBeanTest {

    @Autowired
    private TestBean testBean;

    @Test
    public void test() {
        System.out.println(testBean.getContent());
        Assert.assertEquals(testBean.getContent(),"22222");
    }
}
