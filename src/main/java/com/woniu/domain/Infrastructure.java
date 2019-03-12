package com.woniu.domain;

import java.io.Serializable;

public class Infrastructure implements Serializable {
    private Integer baseid;

    private String basename;

    private static final long serialVersionUID = 1L;

    public Integer getBaseid() {
        return baseid;
    }

    public void setBaseid(Integer baseid) {
        this.baseid = baseid;
    }

    public String getBasename() {
        return basename;
    }

    public void setBasename(String basename) {
        this.basename = basename == null ? null : basename.trim();
    }
}