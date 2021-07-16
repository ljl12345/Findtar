package com.education.findstar.dao.Impl;

import com.education.findstar.dao.LikeDao;
import com.education.findstar.entity.Like;
import com.education.findstar.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class LikeDaoImpl implements LikeDao {

    public LikeDaoImpl() {

    }
    @Override
    public int add(Like like) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        int result = 0;
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.insert("LikeDao.add", like);
        sqlSession.commit();
        sqlSession.close();


        return result;
    }

    @Override
    public int deleteByLike(Like like) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        int result = 0;

            SqlSession sqlSession = MyBatisUtils.openSession();
            result = sqlSession.delete("LikeDao.deleteByLike",like);;
            sqlSession.commit();
            sqlSession.close();

        return result;
    }

    @Override
    public Like findByLike(Like like) {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        Like result = null;
        // 获取sqlSession
        SqlSession sqlSession = MyBatisUtils.openSession();
        result = sqlSession.selectOne("LikeDao.findByLike",like);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
