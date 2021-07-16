package com.education.findstar;

import com.education.findstar.dao.Impl.UserDaoImpl;
import com.education.findstar.dao.UserDao;
import com.education.findstar.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class UserTest{

    public UserDao userDao;
    public SqlSession sqlSession;

    /*@Before
    public void setUp() throws Exception {
        // mybatis-config.xml
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream is = Resources.getResourceAsStream(resource);
        // 构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取sqlSession
        sqlSession = sqlSessionFactory.openSession();
        this.userDao = new UserDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryUserById() throws Exception {

        this.userDao = new UserDaoImpl();
        User user2 = this.userDao.selectByid("00002");
        System.out.println(user2);

    }


    @Test
    public void tesInsertUser() throws Exception {
        User user = new User();
        user.setUserId("00002");
        user.setCreator("管理员");
        Date date = new Date(new java.util.Date().getTime());
        user.setCreate_time(date);
        user.setUsername("张三");
        user.setBan(1);
        user.setPwd("ie8998");
        user.setMail("ooent@qq.com");

        this.userDao = new UserDaoImpl();
        this.userDao.insert(user);
    }

    @Test
    public void updateUser() throws Exception {
        this.userDao = new UserDaoImpl();
        User user = this.userDao.selectByid("00002");
        user.setPwd("12456");

        this.userDao.update(user);
    }

    @Test
    public void testdeleteUser() throws Exception {

        this.userDao = new UserDaoImpl();
        this.userDao.deleteByid("00002");

    }

}