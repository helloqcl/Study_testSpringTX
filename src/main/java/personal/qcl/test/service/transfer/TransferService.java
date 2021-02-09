package personal.qcl.test.service.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import personal.qcl.test.dao.daoImp.TransferDao;
import personal.qcl.test.entities.User;
import personal.qcl.test.service.entities.Transfer;

import javax.annotation.Resource;

@Service
public class TransferService {
    @Autowired
    private TransferDao transferDao;
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public boolean trans(User businessesId, User customerId, Double money) {
        if (transferDao.find(businessesId, customerId)) {

            transferDao.in(businessesId, money);
//            int temp = 1 / 0;
            transferDao.out(customerId, money);
            return true;
        }
//        transferDao.out(customerId, money);
        return false;

    }
}
