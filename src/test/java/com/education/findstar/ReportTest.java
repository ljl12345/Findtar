package com.education.findstar;

import com.education.findstar.dao.Impl.ReportDaoImpl;
import com.education.findstar.dao.ReportDao;
import com.education.findstar.entity.Report;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class ReportTest{

    public ReportDao reportDao;
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
        this.reportDao = new ReportDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryReportById() throws Exception {

        this.reportDao = new ReportDaoImpl();
        Report report2 = this.reportDao.selectByid("80001");
        System.out.println(report2);

    }


    @Test
    public void tesInsertReport() throws Exception {
        Report report = new Report();
        report.setReportId("80001");
        report.setCreator_report("管理员");
        Date date = new Date(new java.util.Date().getTime());
        report.setTimeReport(date);
        report.setReportUsrId("00002");
        report.setTeacherId("20001");
        report.setUserId("00001");
        report.setContentReport("这个人太那啥了");

        this.reportDao = new ReportDaoImpl();
        this.reportDao.insert(report);
    }
/*
    @Test
    public void updateReport() throws Exception {
        this.reportDao = new ReportDaoImpl();
        Report report = this.reportDao.selectByid("80001");
        report.set("10001");

        this.reportDao.update(report);
    }
 */

    @Test
    public void testdeleteReport() throws Exception {

        this.reportDao = new ReportDaoImpl();
        this.reportDao.deleteByid("80001");

    }

}