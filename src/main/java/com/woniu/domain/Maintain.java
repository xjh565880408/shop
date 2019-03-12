package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Maintain implements Serializable {
    private Integer maintainid;

    private Integer accidentid;

    private Integer userid;

    private Date maintainbegintime;

    private Date maintainendtime;

    private String maintainstate;

    private Double maintaincost;

    private static final long serialVersionUID = 1L;

    public Integer getMaintainid() {
        return maintainid;
    }

    public void setMaintainid(Integer maintainid) {
        this.maintainid = maintainid;
    }

    public Integer getAccidentid() {
        return accidentid;
    }

    public void setAccidentid(Integer accidentid) {
        this.accidentid = accidentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getMaintainbegintime() {
        return maintainbegintime;
    }

    public void setMaintainbegintime(Date maintainbegintime) {
        this.maintainbegintime = maintainbegintime;
    }

    public Date getMaintainendtime() {
        return maintainendtime;
    }

    public void setMaintainendtime(Date maintainendtime) {
        this.maintainendtime = maintainendtime;
    }

    public String getMaintainstate() {
        return maintainstate;
    }

    public void setMaintainstate(String maintainstate) {
        this.maintainstate = maintainstate == null ? null : maintainstate.trim();
    }

    public Double getMaintaincost() {
        return maintaincost;
    }

    public void setMaintaincost(Double maintaincost) {
        this.maintaincost = maintaincost;
    }
}