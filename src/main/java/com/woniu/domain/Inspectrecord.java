package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Inspectrecord implements Serializable {
    private Integer recordid;

    private Integer userid;

    private Integer roadid;

    private Date respecttime;

    private Boolean isnormal;

    private byte[] respectperiod;

    private static final long serialVersionUID = 1L;

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoadid() {
        return roadid;
    }

    public void setRoadid(Integer roadid) {
        this.roadid = roadid;
    }

    public Date getRespecttime() {
        return respecttime;
    }

    public void setRespecttime(Date respecttime) {
        this.respecttime = respecttime;
    }

    public Boolean getIsnormal() {
        return isnormal;
    }

    public void setIsnormal(Boolean isnormal) {
        this.isnormal = isnormal;
    }

    public byte[] getRespectperiod() {
        return respectperiod;
    }

    public void setRespectperiod(byte[] respectperiod) {
        this.respectperiod = respectperiod;
    }
}