package com.rmt.monitoringapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.rmt.monitoringapi.model.HolidayCheckDto;
import com.rmt.monitoringapi.model.HolidayCheckInputDto;
import com.rmt.monitoringapi.service.MonitoringService;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Monitoring API Value")
@RequestMapping("/api/v1/monitoring")

public class MonitoringController {
    // private static final Logger LOGGER = LoggerFactory.getLogger(MonitoringController.class);
    private static final String DBRESPONSE = "No records available";

    @Autowired
    private MonitoringService monitoringService;

    @PostMapping("/holidayCheck")
    @ApiOperation(value = "Holiday Date Check", response = HolidayCheckInputDto.class)
    public ResponseEntity<Object> getHolidayCheck(@org.springframework.web.bind.annotation.RequestBody HolidayCheckInputDto hostName){
        // LOGGER.info("Requested endpoint is /holidayCheck");
        List<HolidayCheckDto> holidayCheck = monitoringService.getHolidayCheck(hostName);
        if(!CollectionUtils.isEmpty(holidayCheck)){
            // LOGGER.info("Response records available");
            return new ResponseEntity<>(holidayCheck, HttpStatus.OK);
        }
        else {
            // LOGGER.info("Response records not available ");
            return new ResponseEntity<>(DBRESPONSE, HttpStatus.BAD_REQUEST);
        }
    }
}
