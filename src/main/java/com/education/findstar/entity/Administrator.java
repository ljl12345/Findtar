package com.education.findstar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String Admin_id;
    private String cre_user;
    private Date cre_time;
    public String getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(String admin_id) {
        Admin_id = admin_id;
    }


    public String getCre_user() {
        return cre_user;
    }

    public void setCre_user(String cre_user) {
        this.cre_user = cre_user;
    }

    public Date getCre_time() {
        return cre_time;
    }

    public void setCre_time(Date cre_time) {
        this.cre_time = cre_time;
    }
}
