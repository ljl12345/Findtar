package com.education.findstar.dao.Impl;

import com.education.findstar.dao.UserDao;
import com.education.findstar.entity.User;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
    }

    @Override
    public int insert(User user) {
        String resource = "mybatis-config.xml";

        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.insert("UserDao.insert", user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public int deleteByid(String id) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        int result = 0;

        SqlSession sqlSession = MyBatisUtils.openSession();
            result = sqlSession.delete("UserDao.deleteByid", id);
            sqlSession.commit();
            sqlSession.close();

        return result;
    }

    @Override
    public User selectByid(String id) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        User result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("UserDao.selectByid", id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public List<User> selectAll() {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        List<User> result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectList("UserDao.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public int update(User user) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.update("UserDao.update", user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
