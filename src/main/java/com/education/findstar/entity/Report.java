package com.education.findstar.entity;

import java.sql.Date;

public class Report {
    private String reportId;
    private String userId;
    private String teacherId;
    private String contentReport;
    private String reportUsrId;
    private Date timeReport;
    private String creator_report;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getContentReport() {
        return contentReport;
    }

    public void setContentReport(String contentReport) {
        this.contentReport = contentReport;
    }

    public String getReportUsrId() {
        return reportUsrId;
    }

    public void setReportUsrId(String reportUsrId) {
        this.reportUsrId = reportUsrId;
    }

    public Date getTimeReport() {
        return timeReport;
    }

    public void setTimeReport(Date timeReport) {
        this.timeReport = timeReport;
    }

    public String getCreator_report() {
        return creator_report;
    }

    public void setCreator_report(String creator_report) {
        this.creator_report = creator_report;
    }


}
