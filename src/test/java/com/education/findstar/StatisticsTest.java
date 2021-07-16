package com.education.findstar;

import com.education.findstar.dao.Impl.StatisticsDaoImpl;
import com.education.findstar.dao.StatisticsDao;
import com.education.findstar.entity.Statistics;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class StatisticsTest{

    public StatisticsDao statisticsDao;
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
        this.statisticsDao = new StatisticsDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryStatisticsById() throws Exception {

        this.statisticsDao = new StatisticsDaoImpl();
        Statistics statistics2 = this.statisticsDao.selectByid("20001");
        System.out.println(statistics2);

    }


    @Test
    public void tesInsertStatistics() throws Exception {
        Statistics statistics = new Statistics();
        statistics.setTeacherId("20001");
        statistics.setCreator("管理员");
        Date date = new Date(new java.util.Date().getTime());
        statistics.setTimeCreate(date);
        statistics.setPointAver(98);
        statistics.setNumComment(100);
        statistics.setPointSum(100000);

        this.statisticsDao = new StatisticsDaoImpl();
        this.statisticsDao.insert(statistics);
    }

    @Test
    public void updateStatistics() throws Exception {
        this.statisticsDao = new StatisticsDaoImpl();
        Statistics statistics = this.statisticsDao.selectByid("20001");
        statistics.setPointAver(200);

        this.statisticsDao.update(statistics);
    }

    @Test
    public void testdeleteStatistics() throws Exception {

        this.statisticsDao = new StatisticsDaoImpl();
        this.statisticsDao.deleteByid("20001");

    }

}