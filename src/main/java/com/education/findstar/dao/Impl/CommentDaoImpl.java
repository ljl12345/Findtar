package com.education.findstar.dao.Impl;

import com.education.findstar.dao.CommentDao;
import com.education.findstar.entity.Comment;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CommentDaoImpl implements CommentDao {
    public CommentDaoImpl() {
    }

    @Override
    public int insert(Comment comment) {
        String resource = "mybatis-config.xml";

        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.insert("CommentDao.insert", comment);
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
        result = sqlSession.delete("CommentDao.deleteByid", id);
        sqlSession.commit();
        sqlSession.close();

        return result;
    }

    @Override
    public Comment selectByid(String id) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        Comment result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("CommentDao.selectByid", id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public List<Comment> selectAll() {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        List<Comment> result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectList("CommentDao.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public int update(Comment comment) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        int result = 0;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.update("CommentDao.update", comment);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
