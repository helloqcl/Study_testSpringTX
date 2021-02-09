package personal.qcl.test.dao.daoImp;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.qcl.test.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TransferDaoTest extends TestCase {
    @Autowired
    private TransferDao transferDao;
    private User u1= new User(100,true,"张三");
    @Test
    public void test() {
        transferDao.in(u1,1000000000.1);
    }
}
