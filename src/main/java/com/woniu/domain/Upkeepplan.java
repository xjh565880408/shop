package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Upkeepplan implements Serializable {
    private Integer upkeepid;

    private Date planstarttime;

    private String expectantperiod;

    private Double expectantfees;

    private static final long serialVersionUID = 1L;

    public Integer getUpkeepid() {
        return upkeepid;
    }

    public void setUpkeepid(Integer upkeepid) {
        this.upkeepid = upkeepid;
    }

    public Date getPlanstarttime() {
        return planstarttime;
    }

    public void setPlanstarttime(Date planstarttime) {
        this.planstarttime = planstarttime;
    }

    public String getExpectantperiod() {
        return expectantperiod;
    }

    public void setExpectantperiod(String expectantperiod) {
        this.expectantperiod = expectantperiod == null ? null : expectantperiod.trim();
    }

    public Double getExpectantfees() {
        return expectantfees;
    }

    public void setExpectantfees(Double expectantfees) {
        this.expectantfees = expectantfees;
    }
}