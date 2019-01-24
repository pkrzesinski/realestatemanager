package com.manager.estate.feature.reading.dao;
import com.manager.estate.feature.reading.model.Reading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingRepository extends JpaRepository<Reading, Long> {
}
