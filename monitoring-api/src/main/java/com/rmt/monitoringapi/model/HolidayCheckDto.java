package com.rmt.monitoringapi.model;

import java.io.Serializable;

public class HolidayCheckDto implements Serializable{

    private static final long serialVersionUID = 1L;
    private String cityName ;

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


}
