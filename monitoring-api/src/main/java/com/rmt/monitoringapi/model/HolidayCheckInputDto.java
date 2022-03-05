package com.rmt.monitoringapi.model;

import java.io.Serializable;

public class HolidayCheckInputDto implements Serializable{

    private static final long serialVersionUID = 1L;
    private String hostname;

    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }


}
