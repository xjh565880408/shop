package com.woniu.domain;

import java.io.Serializable;

public class Tree implements Serializable {
    private Integer treeid;

    private String treename;

    private Integer pid;

    private static final long serialVersionUID = 1L;

    public Integer getTreeid() {
        return treeid;
    }

    public void setTreeid(Integer treeid) {
        this.treeid = treeid;
    }

    public String getTreename() {
        return treename;
    }

    public void setTreename(String treename) {
        this.treename = treename == null ? null : treename.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}