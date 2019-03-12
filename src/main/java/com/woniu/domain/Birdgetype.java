package com.woniu.domain;

import java.io.Serializable;

public class Birdgetype implements Serializable {
    private Integer bridgetypeid;

    private String birdgetypename;

    private static final long serialVersionUID = 1L;

    public Integer getBridgetypeid() {
        return bridgetypeid;
    }

    public void setBridgetypeid(Integer bridgetypeid) {
        this.bridgetypeid = bridgetypeid;
    }

    public String getBirdgetypename() {
        return birdgetypename;
    }

    public void setBirdgetypename(String birdgetypename) {
        this.birdgetypename = birdgetypename == null ? null : birdgetypename.trim();
    }
}