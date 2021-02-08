package junitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import personal.qcl.test.testSpringJunit.SpringJunit;

import javax.crypto.interfaces.PBEKey;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJunitSpringInteagration {
    @Autowired
    private SpringJunit springJunit;

    @Test
    public void testSpringJUnit(){
        System.out.println(springJunit.getsName());
    }


}
