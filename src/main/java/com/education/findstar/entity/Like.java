package com.education.findstar.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Like implements Comparable<Like>, Serializable {
    private String likeId;
    private String usrId;
    private String teacherId;

    private String creator;
    private Date create_time;

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public int compareTo(Like o) {
        if(this.hashCode() > o.hashCode())
            return 1;
        else if (this.hashCode() < o.hashCode())
            return -1;
        return 0;
    }
}
