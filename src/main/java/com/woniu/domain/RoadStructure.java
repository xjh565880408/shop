package com.woniu.domain;

import java.io.Serializable;

public class RoadStructure implements Serializable {
    private Integer conid;

    private Integer roadid;

    private Integer baseid;

    private Integer birdgeid;

    private static final long serialVersionUID = 1L;

    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    public Integer getRoadid() {
        return roadid;
    }

    public void setRoadid(Integer roadid) {
        this.roadid = roadid;
    }

    public Integer getBaseid() {
        return baseid;
    }

    public void setBaseid(Integer baseid) {
        this.baseid = baseid;
    }

    public Integer getBirdgeid() {
        return birdgeid;
    }

    public void setBirdgeid(Integer birdgeid) {
        this.birdgeid = birdgeid;
    }
}