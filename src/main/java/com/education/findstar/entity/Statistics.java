package com.education.findstar.entity;

import java.sql.Date;

public class Statistics {
    private String teacherId;
    private int numComment;
    private double pointAver;
    private double pointSum;
    private Date timeCreate;
    private  String Creator;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getNumComment() {
        return numComment;
    }

    public void setNumComment(int numComment) {
        this.numComment = numComment;
    }

    public double getPointAver() {
        return pointAver;
    }

    public void setPointAver(double pointAver) {
        this.pointAver = pointAver;
    }

    public double getPointSum() {
        return pointSum;
    }

    public void setPointSum(double pointSum) {
        this.pointSum = pointSum;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }
}
