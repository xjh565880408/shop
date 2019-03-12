package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Birdge implements Serializable {
    private Integer birdgeid;

    private Integer roadid;

    private Integer bridgetypeid;

    private String birdgename;

    private Date buildtime;

    private String buildcompany;

    private String maintenanceperiod;

    private static final long serialVersionUID = 1L;

    public Integer getBirdgeid() {
        return birdgeid;
    }

    public void setBirdgeid(Integer birdgeid) {
        this.birdgeid = birdgeid;
    }

    public Integer getRoadid() {
        return roadid;
    }

    public void setRoadid(Integer roadid) {
        this.roadid = roadid;
    }

    public Integer getBridgetypeid() {
        return bridgetypeid;
    }

    public void setBridgetypeid(Integer bridgetypeid) {
        this.bridgetypeid = bridgetypeid;
    }

    public String getBirdgename() {
        return birdgename;
    }

    public void setBirdgename(String birdgename) {
        this.birdgename = birdgename == null ? null : birdgename.trim();
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

    public String getMaintenanceperiod() {
        return maintenanceperiod;
    }

    public void setMaintenanceperiod(String maintenanceperiod) {
        this.maintenanceperiod = maintenanceperiod == null ? null : maintenanceperiod.trim();
    }
}