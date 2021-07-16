package com.education.findstar.service;

import com.education.findstar.dao.LikeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LikeService {
    @Autowired
    LikeDao likeDao;
/*
    public void deleteById(IdClass id){
        likeDao.deleteById(id.getLikeId(), id.getUsrId(), id.getTeacherId());
   ;
    }

    public Like findById(IdClass id){
        return likeDao.findById(id.getLikeId(), id.getUsrId(), id.getTeacherId());
    }
    public  void save(Like like){
         likeDao.add(like);
    }*/
}
