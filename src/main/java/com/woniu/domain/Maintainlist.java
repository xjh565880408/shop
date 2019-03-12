package com.woniu.domain;

import java.io.Serializable;

public class Maintainlist extends MaintainlistKey implements Serializable {
    private Integer userid;

    private Integer materialnumber;

    private Double totalprice;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMaterialnumber() {
        return materialnumber;
    }

    public void setMaterialnumber(Integer materialnumber) {
        this.materialnumber = materialnumber;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }
}