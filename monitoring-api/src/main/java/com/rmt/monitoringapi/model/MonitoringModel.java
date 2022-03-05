package com.rmt.monitoringapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonitoringModel implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
