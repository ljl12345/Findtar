package com.education.findstar;

import com.education.findstar.dao.Impl.LikeDaoImpl;
import com.education.findstar.dao.LikeDao;
import com.education.findstar.entity.Like;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class LikeTest{

    public LikeDao userDao;
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
        this.userDao = new LikeDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryUserById() throws Exception {
        Like like = new Like();
        like.setLikeId("00001");
        like.setUsrId("00001");
        like.setTeacherId("20001");
        this.userDao = new LikeDaoImpl();
        Like like2 = this.userDao.findByLike(like);
        System.out.println(like2);

    }


    @Test
    public void tesInsertUser() throws Exception {
        Like like = new Like();
        like.setLikeId("00001");
        like.setCreator("管理员");
        Date date = new Date(new java.util.Date().getTime());
        like.setCreate_time(date);
        like.setUsrId("00001");
        like.setTeacherId("20001");
        this.userDao = new LikeDaoImpl();
        this.userDao.add(like);
    }
/*
    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setBirthday(new Date());
        user.setName("静鹏");
        user.setPassword("654321");
        user.setSex(1);
        user.setUserName("evanjin");
        user.setId("1");
        this.userDao.updateUser(user);
        this.sqlSession.commit();
    }*/

    @Test
    public void testdeleteUser() throws Exception {
        Like like = new Like();
        like.setLikeId("00001");
        like.setCreator("管理员");
        Date date = new Date(new java.util.Date().getTime());
        like.setCreate_time(date);
        like.setUsrId("00001");
        like.setTeacherId("20001");
        this.userDao = new LikeDaoImpl();
        this.userDao.deleteByLike(like);

    }

}