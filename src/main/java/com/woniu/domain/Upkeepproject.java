package com.woniu.domain;

import java.io.Serializable;

public class Upkeepproject implements Serializable {
    private Integer projectid;

    private Integer roleid;

    private Integer upkeepid;

    private String projectname;

    private Integer numCon;

    private static final long serialVersionUID = 1L;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUpkeepid() {
        return upkeepid;
    }

    public void setUpkeepid(Integer upkeepid) {
        this.upkeepid = upkeepid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Integer getNumCon() {
        return numCon;
    }

    public void setNumCon(Integer numCon) {
        this.numCon = numCon;
    }
}