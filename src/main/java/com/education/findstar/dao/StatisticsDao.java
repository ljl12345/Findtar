package com.education.findstar.dao;

import com.education.findstar.entity.Statistics;

import java.util.List;

public interface StatisticsDao {
    public int insert(Statistics statistics);
    public int deleteByid(String id);
    public List<Statistics> selectAll ();
    public Statistics selectByid(String id);
    public int update(Statistics statistics);
}
