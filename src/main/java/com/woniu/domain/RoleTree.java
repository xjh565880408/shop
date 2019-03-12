package com.woniu.domain;

import java.io.Serializable;

public class RoleTree implements Serializable {
    private Integer roleid;

    private Integer treeid;

    private static final long serialVersionUID = 1L;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getTreeid() {
        return treeid;
    }

    public void setTreeid(Integer treeid) {
        this.treeid = treeid;
    }
}