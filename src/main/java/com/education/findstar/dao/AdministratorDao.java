package com.education.findstar.dao;

import com.education.findstar.entity.Administrator;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdministratorDao {
    //增加管理员
    public int insert (Administrator administer);
    //删除管理员
    public int deleteByid(String id);
    //查询
    public Administrator selectByid (String id);
    //查询列表
    public List<Administrator> selectAll ();

}