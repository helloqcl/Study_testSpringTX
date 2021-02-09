package personal.qcl.test.dao.daoImp;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import personal.qcl.test.dao.daoInterface.Find;
import personal.qcl.test.dao.daoInterface.In;
import personal.qcl.test.dao.daoInterface.Out;
import personal.qcl.test.entities.User;

import java.util.List;

@Component("transferDao")
public class TransferDao implements In, Out, Find {
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean find(User user, User user1) {
      User u =  jdbcTemplate.queryForObject("SELECT * FROM `user` A,`user` B WHERE A.uId=? and  B.uId=?", new BeanPropertyRowMapper<User>(User.class) ,user.getuId(), user1.getuId());
        if (u==null){
            return false;
        }
        return true;
    }

    @Override
    public User in(User user, double d1) {

        jdbcTemplate.update("UPDATE `user` set `user`.uMoney=`user`.uMoney+? WHERE `user`.uId = ? ", d1, user.getuId());
        return user;

    }

    @Override
    public User out(User user, double d1) {
        jdbcTemplate.update("UPDATE `user` set `user`.uMoney=`user`.uMoney - ? WHERE `user`.uId = ? ", d1, user.getuId());
        return user;
    }


}
