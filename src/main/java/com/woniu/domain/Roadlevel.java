package com.woniu.domain;

import java.io.Serializable;

public class Roadlevel implements Serializable {
    private Integer roadlevelid;

    private String roadlevelname;

    private static final long serialVersionUID = 1L;

    public Integer getRoadlevelid() {
        return roadlevelid;
    }

    public void setRoadlevelid(Integer roadlevelid) {
        this.roadlevelid = roadlevelid;
    }

    public String getRoadlevelname() {
        return roadlevelname;
    }

    public void setRoadlevelname(String roadlevelname) {
        this.roadlevelname = roadlevelname == null ? null : roadlevelname.trim();
    }
}