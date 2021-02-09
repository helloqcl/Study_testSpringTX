package personal.qcl.test.testSpringJunit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("SpringJunit")
public class SpringJunit {
    @Value("100")
    private int sId;
    @Value("Spring测试类")
    private String sName;



    public SpringJunit() {
    }


    //setter() AND getter
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    //测试application 初始和销毁方法
    @PostConstruct
    public void initSp(){
        System.out.println("this is init.");
    }
    @PreDestroy
    public void destroySp(){
        System.out.println("this is destroy.");
    }
}
