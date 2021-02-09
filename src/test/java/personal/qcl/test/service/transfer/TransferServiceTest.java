package personal.qcl.test.service.transfer;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.qcl.test.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TransferServiceTest extends TestCase {
    @Autowired
    private TransferService transferService;
    private User user01= new User(100,true,"张三",100);
    private  User user02 = new User();
    private double money =1000100;
    @Test
    public void test() {
        transferService.trans(user01,user02,money);
    }
}