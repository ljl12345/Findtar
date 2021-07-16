package com.education.findstar.dao;

import com.education.findstar.entity.Report;

import java.util.List;

public interface ReportDao {
    //添加评论
    public int insert(Report report);
    //删除评论
    public  int deleteByid(String id);
    //显示评论列表
    public List<Report> selectAll ();
    //通过教师id查询评论
    public Report selectByid(String id);
}
