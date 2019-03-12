package com.woniu.domain;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer deptid;

    private String deptname;

    private static final long serialVersionUID = 1L;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}