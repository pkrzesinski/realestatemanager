package com.manager.estate.feature.readings.readingDate.dao;

import com.manager.estate.feature.readings.readingDate.model.Readings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingsRepository extends JpaRepository<Readings, Long> {
}