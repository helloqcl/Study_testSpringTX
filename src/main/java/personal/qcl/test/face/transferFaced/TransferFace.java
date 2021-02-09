package personal.qcl.test.face.transferFaced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import personal.qcl.test.entities.User;
import personal.qcl.test.service.transfer.TransferService;

@Repository
public class TransferFace {
    private User user01= new User(100,true,"张三",100);
    public   User user02 = new User(101,true,"李白",100);
    private double money =8;
    public int i1=1;
    @Autowired
     private  TransferService service;
     public void tans() {
         Boolean bl1 = service.trans(user01, user02, money);
         if (bl1) {
             System.out.println("转账成功");
         } else {
             System.out.println("转账失败");
         }
     }

}
