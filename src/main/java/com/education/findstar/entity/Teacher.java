package com.education.findstar.entity;

import java.sql.Date;
public class Teacher implements Comparable<Teacher>{
    private String teacherId;
    private String organizationId;
    private String nameTeacher;
    private Date timeCreate;
    private String creator;
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }




    @Override
    public int compareTo(Teacher o) {
        if(this.teacherId.hashCode() > o.teacherId.hashCode())
            return 1;
        else if(this.teacherId.hashCode() < o.teacherId.hashCode())
            return -1;
        return  0;

    }
}
