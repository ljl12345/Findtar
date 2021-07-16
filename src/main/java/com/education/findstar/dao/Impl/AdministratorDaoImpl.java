package com.education.findstar.dao.Impl;

import com.education.findstar.dao.AdministratorDao;
import com.education.findstar.entity.Administrator;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AdministratorDaoImpl implements AdministratorDao {
    public AdministratorDaoImpl() {
    }

    @Override
    public int insert(Administrator administrator) {
        String resource = "mybatis-config.xml";

        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.insert("AdministratorDao.insert", administrator);
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
        result = sqlSession.delete("AdministratorDao.deleteByid", id);
        sqlSession.commit();
        sqlSession.close();

        return result;
    }

    @Override
    public Administrator selectByid(String id) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        Administrator result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("AdministratorDao.selectByid", id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public List<Administrator> selectAll() {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        List<Administrator> result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectList("AdministratorDao.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return result;
    }


}
