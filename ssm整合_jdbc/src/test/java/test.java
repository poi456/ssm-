import com.rj1814.dao.accountDao;
import com.rj1814.pojo.entity;
import com.rj1814.utils.mySqlFa;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void findAll(){
        SqlSession session = mySqlFa.mysqlF();
        accountDao mapper = session.getMapper(accountDao.class);
        List<entity> all = mapper.findAll();
        System.out.println(all);
    }
@Test
    public void idfindAll(){
        SqlSession session = mySqlFa.mysqlF();
        accountDao mapper = session.getMapper(accountDao.class);
        entity entity = mapper.idfindAll(1);
        System.out.println(entity);
    }

    @Test
    public void updata(){
        SqlSession session = mySqlFa.mysqlF();
        accountDao mapper = session.getMapper(accountDao.class);
        entity e=new entity(2,"aa");
        System.out.println(e);
        mapper.updata(e);
    }
    @Test
    public void insert(){
        SqlSession session = mySqlFa.mysqlF();
        accountDao mapper = session.getMapper(accountDao.class);
        entity e=new entity();
        e.setId(3);
        e.setName("2");
         mapper.insert(e);
    }
    @Test
    public void data(){
        SqlSession session = mySqlFa.mysqlF();
        accountDao mapper = session.getMapper(accountDao.class);

        mapper.data(2);
    }
}
