package com.education.findstar.entity;

import java.io.Serializable;

public class IdClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private String likeId;
    private String usrId;
    private String teacherId;

    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }


}
