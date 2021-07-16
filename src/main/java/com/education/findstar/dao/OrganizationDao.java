package com.education.findstar.dao;

import com.education.findstar.entity.Organization;

import java.util.List;

public interface OrganizationDao {
    //添加
    public int insert(Organization organization);
    //删除
    public  int deleteByid(String id);

    public List<Organization> selectAll ();

    public  Organization selectByid(String id);

    public int update(Organization organization);
}
