package com.rmt.monitoringapi.repository;

import java.util.Collection;

import com.rmt.monitoringapi.model.MonitoringModel;
import com.rmt.monitoringapi.projections.HolidayCheckInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitoringRepository extends JpaRepository<MonitoringModel, Long>{
    Collection<HolidayCheckInterface> getHolidayCheckNative(
        @Param("hostname") String hostname
    );
} 