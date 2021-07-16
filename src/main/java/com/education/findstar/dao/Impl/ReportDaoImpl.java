package com.education.findstar.dao.Impl;

import com.education.findstar.dao.ReportDao;
import com.education.findstar.entity.Report;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.InputStream;
import java.util.List;

public class ReportDaoImpl implements ReportDao {
    public ReportDaoImpl() {}
    @Override
    public int insert(Report Report) {
        String resource = "mybatis-config.xml";
        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
            result = sqlSession.insert("ReportDao.insert", Report);
            sqlSession.commit();
            sqlSession.close();
        return result;
    }

    @Override
    public  int deleteByid(String id){
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream is = null;
        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();

            result = sqlSession.delete("ReportDao.deleteByid",id);
            sqlSession.commit();
            sqlSession.close();

        return result;
    }

    @Override
    public Report selectByid(String id) {
        String resource = "mybatis-config.xml";

        Report result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("ReportDao.selectByid",id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    @Override
    public List<Report> selectAll () {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream is = null;
        List<Report> result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectList("ReportDao.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
