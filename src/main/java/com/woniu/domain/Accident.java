package com.woniu.domain;

import java.io.Serializable;

public class Accident implements Serializable {
    private Integer accidentid;

    private Integer recordid;

    private String accidenttype;

    private String picture;

    private String accidentlevel;

    private static final long serialVersionUID = 1L;

    public Integer getAccidentid() {
        return accidentid;
    }

    public void setAccidentid(Integer accidentid) {
        this.accidentid = accidentid;
    }

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public String getAccidenttype() {
        return accidenttype;
    }

    public void setAccidenttype(String accidenttype) {
        this.accidenttype = accidenttype == null ? null : accidenttype.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getAccidentlevel() {
        return accidentlevel;
    }

    public void setAccidentlevel(String accidentlevel) {
        this.accidentlevel = accidentlevel == null ? null : accidentlevel.trim();
    }
}