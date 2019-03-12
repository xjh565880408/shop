package com.woniu.domain;

import java.io.Serializable;

public class RoadProject implements Serializable {
    private Integer projectid;

    private Integer roadid;

    private static final long serialVersionUID = 1L;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getRoadid() {
        return roadid;
    }

    public void setRoadid(Integer roadid) {
        this.roadid = roadid;
    }
}