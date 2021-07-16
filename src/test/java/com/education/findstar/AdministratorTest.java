package com.education.findstar;

import com.education.findstar.dao.Impl.AdministratorDaoImpl;
import com.education.findstar.dao.AdministratorDao;
import com.education.findstar.entity.Administrator;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class AdministratorTest{

    public AdministratorDao administratorDao;
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
        this.administratorDao = new AdministratorDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryAdministratorById() throws Exception {

        this.administratorDao = new AdministratorDaoImpl();
        Administrator administrator2 = this.administratorDao.selectByid("00001");
        System.out.println(administrator2);

    }


    @Test
    public void tesInsertAdministrator() throws Exception {
        Administrator administrator = new Administrator();
        administrator.setAdmin_id("00001");
        administrator.setCre_user("超级管理员");
        Date date = new Date(new java.util.Date().getTime());
        administrator.setCre_time(date);

        this.administratorDao = new AdministratorDaoImpl();
        this.administratorDao.insert(administrator);
    }

    @Test
    public void testdeleteAdministrator() throws Exception {

        this.administratorDao = new AdministratorDaoImpl();
        this.administratorDao.deleteByid("01");

    }

}