package com.woniu.domain;

import java.io.Serializable;

public class MaintainlistKey implements Serializable {
    private Integer accidentid;

    private Integer materialid;

    private static final long serialVersionUID = 1L;

    public Integer getAccidentid() {
        return accidentid;
    }

    public void setAccidentid(Integer accidentid) {
        this.accidentid = accidentid;
    }

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }
}