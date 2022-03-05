package com.rmt.monitoringapi.projections;

import org.springframework.data.web.JsonPath;
import org.springframework.data.web.ProjectedPayload;

@ProjectedPayload
public interface HolidayCheckInterface {
    @JsonPath("$..CITYNAME")
    String getCITYNAME();

}
