package com.education.findstar;

import com.education.findstar.dao.CommentDao;
import com.education.findstar.dao.Impl.CommentDaoImpl;
import com.education.findstar.entity.Comment;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

public class CommentTest{

    public CommentDao commentDao;
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
        this.commentDao = new CommentDaoImpl(sqlSession);
    }
*/
    @Test
    public void queryCommentById() throws Exception {

        this.commentDao = new CommentDaoImpl();

        Comment comment2 = this.commentDao.selectByid("90001");
        System.out.println(comment2);

    }
    @Test
    public void queryCommentAllById() throws Exception {

        this.commentDao = new CommentDaoImpl();

        List<Comment> comment2 = this.commentDao.selectAll();
        System.out.println(comment2);

    }

    @Test
    public void tesInsertComment() throws Exception {
        Comment comment = new Comment();
        comment.setCommentId("90001");
        comment.setCreator("管理员");
        Date date = new Date(new java.util.Date().getTime());
        comment.setTime(date);
        comment.setCreateTime(date);
        comment.setTeacherId("20001");
        comment.setAcademic_comment("呵呵");
        comment.setUserId("00002");
        comment.setOverview("还行");
        comment.setScore(99);

        this.commentDao = new CommentDaoImpl();
        this.commentDao.insert(comment);
    }

    @Test
    public void updateComment() throws Exception {
        this.commentDao = new CommentDaoImpl();
        Comment comment = this.commentDao.selectByid("90001");
        comment.setAcademic_comment("相当的nice");

        this.commentDao.update(comment);
    }

    @Test
    public void testdeleteComment() throws Exception {

        this.commentDao = new CommentDaoImpl();
        this.commentDao.deleteByid("30001");

    }

}