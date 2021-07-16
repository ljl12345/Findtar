package com.education.findstar.dao;

import com.education.findstar.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //添加用户
    public int insert(User user);
    //删除用户
    public int deleteByid(String id);
    //修改用户信息
    public int update(User user);
    //查询用户
    public  User selectByid(String id);
    // 用户列表
    public List<User> selectAll();
}
