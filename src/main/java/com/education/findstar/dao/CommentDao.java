package com.education.findstar.dao;


import com.education.findstar.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {
    //添加评论
    public int insert(Comment comment);
    //删除评论
    public  int deleteByid(String id);
    //显示评论列表
    public List<Comment> selectAll ();
    //通过教师id查询评论
    public  Comment selectByid(String id);
    //修改评论内容
    int update(Comment comment);
}
