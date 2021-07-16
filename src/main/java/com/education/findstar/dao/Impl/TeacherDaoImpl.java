package com.education.findstar.dao.Impl;

import com.education.findstar.dao.TeacherDao;
import com.education.findstar.entity.Teacher;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
    public TeacherDaoImpl() {}
    @Override
    public int insert(Teacher teacher) {
        String resource = "mybatis-config.xml";

        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
            result = sqlSession.insert("TeacherDao.insert", teacher);
            sqlSession.commit();
           sqlSession.close();


        return result;
    }

    @Override
    public  int deleteByid(String id){
        String resource = "mybatis-config.xml";

        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
            result = sqlSession.delete("TeacherDao.deleteByid",id);
            sqlSession.commit();
            sqlSession.close();

        return result;
    }

    @Override
    public  Teacher selectByid(String id) {
        String resource = "mybatis-config.xml";
        // 读取配置文件

        Teacher result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("TeacherDao.selectByid",id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    @Override
    public List<Teacher> selectAll () {
        String resource = "mybatis-config.xml";

        List<Teacher> result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectList("TeacherDao.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    @Override
    public int update(Teacher teacher)
    {
        String resource = "mybatis-config.xml";

        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.update("TeacherDao.update",teacher);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
