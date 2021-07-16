package com.education.findstar;

import com.education.findstar.dao.Impl.TeacherDaoImpl;
import com.education.findstar.dao.TeacherDao;
import com.education.findstar.entity.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;

public class TeacherTest{

    public TeacherDao teacherDao;
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
        this.teacherDao = new TeacherDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryTeacherById() throws Exception {

        this.teacherDao = new TeacherDaoImpl();
        Teacher teacher2 = this.teacherDao.selectByid("20003");
        System.out.println(teacher2);

    }


    @Test
    public void tesInsertTeacher() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setTeacherId("20003");
        teacher.setCreator("管理员");
        Date date = new Date(new java.util.Date().getTime());
        teacher.setTimeCreate(date);
        teacher.setNameTeacher("王二");
        teacher.setOrganizationId("10002");

        this.teacherDao = new TeacherDaoImpl();
        this.teacherDao.insert(teacher);
    }

    @Test
    public void updateTeacher() throws Exception {
        this.teacherDao = new TeacherDaoImpl();
        Teacher teacher = this.teacherDao.selectByid("20003");
        teacher.setOrganizationId("10001");

        this.teacherDao.update(teacher);
    }

    @Test
    public void testdeleteTeacher() throws Exception {

        this.teacherDao = new TeacherDaoImpl();
        this.teacherDao.deleteByid("20003");

    }

}