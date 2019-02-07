package com.manager.estate.feature.readings.model;

import com.manager.estate.feature.meter.model.Meter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadingValue {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Meter meter;
    private double value;
}