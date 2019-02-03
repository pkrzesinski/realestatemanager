package com.manager.estate.feature.reading.dao;
import com.manager.estate.feature.reading.model.MeterValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeterValueRepository extends JpaRepository<MeterValue, Long> {
}
