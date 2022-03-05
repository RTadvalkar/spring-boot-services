package com.rmt.monitoringapi.service;

import com.rmt.monitoringapi.model.HolidayCheckInputDto;
import com.rmt.monitoringapi.repository.MonitoringRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.rmt.monitoringapi.domain.Mapper;
import com.rmt.monitoringapi.model.HolidayCheckDto;

@Service

public class MonitoringService {

    @Autowired
    private MonitoringRepository monitoringRepository;

    @Autowired
    private Mapper mapper;
    
    public List<HolidayCheckDto> getHolidayCheck(HolidayCheckInputDto hostName) {
        System.out.println("Hostname :: "+hostName.getHostname());
        return mapper.mapToHolidayCheckDto(monitoringRepository.getHolidayCheckNative(hostName.getHostname()));
    }

}
