package com.education.findstar.dao.Impl;

import com.education.findstar.dao.StatisticsDao;
import com.education.findstar.entity.Statistics;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StatisticsDaoImpl implements StatisticsDao {
    public StatisticsDaoImpl() {}
    @Override
    public int insert(Statistics statistics) {
        String resource = "mybatis-config.xml";

        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.insert("StatisticsDao.insert", statistics);
        sqlSession.commit();
        sqlSession.close();


        return result;
    }

    @Override
    public  int deleteByid(String id){
        String resource = "mybatis-config.xml";

        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.delete("StatisticsDao.deleteByid",id);
        sqlSession.commit();
        sqlSession.close();

        return result;
    }

    @Override
    public  Statistics selectByid(String id) {
        String resource = "mybatis-config.xml";
        // 读取配置文件

        Statistics result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("StatisticsDao.selectByid",id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    @Override
    public List<Statistics> selectAll () {
        String resource = "mybatis-config.xml";

        List<Statistics> result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectList("StatisticsDao.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    @Override
    public int update(Statistics statistics)
    {
        String resource = "mybatis-config.xml";

        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.update("StatisticsDao.update",statistics);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
