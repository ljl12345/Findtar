package com.education.findstar.dao.Impl;

import com.education.findstar.dao.OrganizationDao;
import com.education.findstar.entity.Organization;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.InputStream;
import java.util.List;

public class OrganizationDaoImpl implements OrganizationDao {
    public OrganizationDaoImpl() {}
    @Override
    public int insert(Organization organization) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream is = null;
        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
            result = sqlSession.insert("OrganizationDao.insert", organization);
            sqlSession.commit();

        return result;
    }

    @Override
    public  int deleteByid(String id){
        String resource = "mybatis-config.xml";

        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
            result = sqlSession.delete("OrganizationDao.deleteByid",id);
            sqlSession.commit();
            sqlSession.close();

        return result;
    }

    @Override
    public  Organization selectByid(String id) {
        String resource = "mybatis-config.xml";

        Organization result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("OrganizationDao.selectByid",id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    @Override
    public List<Organization> selectAll () {
        String resource = "mybatis-config.xml";

        List<Organization> result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectList("OrganizationDao.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    @Override
    public int update(Organization organization)
    {
        String resource = "mybatis-config.xml";

        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.update("OrganizationDao.update",organization);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
