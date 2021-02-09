package personal.qcl.test.face.transferFaced;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.qcl.test.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TransferFaceTest extends TestCase {
    @Autowired
    private TransferFace transferFace;
    @Test
    public void test(){
       User u= transferFace.user02;
       System.out.println(u);
       transferFace.tans();

    }
}

