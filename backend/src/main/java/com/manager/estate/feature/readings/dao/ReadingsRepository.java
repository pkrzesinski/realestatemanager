package com.manager.estate.feature.readings.dao;

import com.manager.estate.feature.readings.model.Readings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingsRepository extends JpaRepository<Readings, Long> {
}