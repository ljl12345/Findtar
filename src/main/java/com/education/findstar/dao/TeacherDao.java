package com.education.findstar.dao;

import com.education.findstar.entity.Teacher;

import java.util.List;

public interface TeacherDao {
    //添加评论
    public int insert(Teacher teacher);
    //删除评论
    public  int deleteByid(String id);
    //显示评论列表
    public List<Teacher> selectAll ();
    //通过教师id查询评论
    public Teacher selectByid(String id);

    public int update(Teacher teacher);
}