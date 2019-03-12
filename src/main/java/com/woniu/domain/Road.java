package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Road implements Serializable {
    private Integer roadid;

    private Integer typeid;

    private Integer roadlevelid;

    private String roadname;

    private String beginposition;

    private String endposition;

    private String beginsign;

    private String endsign;

    private Date buildtime;

    private String buildcompany;

    private static final long serialVersionUID = 1L;

    public Integer getRoadid() {
        return roadid;
    }

    public void setRoadid(Integer roadid) {
        this.roadid = roadid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getRoadlevelid() {
        return roadlevelid;
    }

    public void setRoadlevelid(Integer roadlevelid) {
        this.roadlevelid = roadlevelid;
    }

    public String getRoadname() {
        return roadname;
    }

    public void setRoadname(String roadname) {
        this.roadname = roadname == null ? null : roadname.trim();
    }

    public String getBeginposition() {
        return beginposition;
    }

    public void setBeginposition(String beginposition) {
        this.beginposition = beginposition == null ? null : beginposition.trim();
    }

    public String getEndposition() {
        return endposition;
    }

    public void setEndposition(String endposition) {
        this.endposition = endposition == null ? null : endposition.trim();
    }

    public String getBeginsign() {
        return beginsign;
    }

    public void setBeginsign(String beginsign) {
        this.beginsign = beginsign == null ? null : beginsign.trim();
    }

    public String getEndsign() {
        return endsign;
    }

    public void setEndsign(String endsign) {
        this.endsign = endsign == null ? null : endsign.trim();
    }

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }

    public String getBuildcompany() {
        return buildcompany;
    }

    public void setBuildcompany(String buildcompany) {
        this.buildcompany = buildcompany == null ? null : buildcompany.trim();
    }
}