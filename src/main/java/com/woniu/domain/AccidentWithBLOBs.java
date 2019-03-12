package com.woniu.domain;

import java.io.Serializable;

public class AccidentWithBLOBs extends Accident implements Serializable {
    private String description;

    private String accidentreason;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAccidentreason() {
        return accidentreason;
    }

    public void setAccidentreason(String accidentreason) {
        this.accidentreason = accidentreason == null ? null : accidentreason.trim();
    }
}