package com.manager.estate.feature.meter.dao;
import com.manager.estate.feature.meter.model.Meter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeterRepository extends JpaRepository<Meter, Long> {
}
