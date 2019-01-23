package com.manager.estate.feature.reading.model;

import com.manager.estate.feature.meter.model.Meter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reading {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Meter meter;

    private double value;
    private LocalDate readingDate;
}
