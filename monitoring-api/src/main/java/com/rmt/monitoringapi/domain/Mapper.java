package com.rmt.monitoringapi.domain;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.rmt.monitoringapi.model.HolidayCheckDto;
import com.rmt.monitoringapi.projections.HolidayCheckInterface;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class Mapper {

    public List<HolidayCheckDto> mapToHolidayCheckDto(Collection<HolidayCheckInterface> list){
        return list.stream().map(this::convertToHolidayCheckDto).collect(Collectors.toList());
    }

    public HolidayCheckDto convertToHolidayCheckDto(HolidayCheckInterface collection) {
        HolidayCheckDto dto = new HolidayCheckDto();
        BeanUtils.copyProperties(collection, dto);
        dto.setCityName(collection.getCITYNAME());

        return dto;
    }

}
