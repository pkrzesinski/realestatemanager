package com.manager.estate.feature.readings.model;

import com.manager.estate.feature.meter.model.Meter;
import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class ReadingValue extends DatabaseEntity {

    @ManyToOne(optional = false)
    private Meter meter;
    @Min(0)
    private double value;
}