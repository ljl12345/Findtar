package com.education.findstar.dao;

import com.education.findstar.entity.Like;

public interface LikeDao {

    //增加
    int add(Like like);
    //删除
    int deleteByLike(Like like);
    //查找
    Like findByLike(Like like);
}
