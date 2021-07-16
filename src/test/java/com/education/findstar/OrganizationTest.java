package com.education.findstar;

import com.education.findstar.dao.Impl.OrganizationDaoImpl;
import com.education.findstar.dao.OrganizationDao;
import com.education.findstar.entity.Organization;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class OrganizationTest{

    public OrganizationDao organizationDao;
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
        this.organizationDao = new OrganizationDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryOrganizationById() throws Exception {

        this.organizationDao = new OrganizationDaoImpl();
        Organization organization2 = this.organizationDao.selectByid("10003");
        System.out.println(organization2);

    }


    @Test
    public void tesInsertOrganization() throws Exception {
        Organization organization = new Organization();
        organization.setOrganizationId("10003");
        organization.setCre_user("管理员");
        Date date = new Date(new java.util.Date().getTime());
        organization.setCre_time(date);
        organization.setOrganizationName("电气学院");
        organization.setSuperId("10000");

        this.organizationDao = new OrganizationDaoImpl();
        this.organizationDao.insert(organization);
    }

    @Test
    public void updateOrganization() throws Exception {
        this.organizationDao = new OrganizationDaoImpl();
        Organization organization = this.organizationDao.selectByid("10003");
        organization.setOrganizationName("金融学院");

        this.organizationDao.update(organization);
    }

    @Test
    public void testdeleteOrganization() throws Exception {

        this.organizationDao = new OrganizationDaoImpl();
        this.organizationDao.deleteByid("10003");

    }

}