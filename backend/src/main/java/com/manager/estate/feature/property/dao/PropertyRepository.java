package com.manager.estate.feature.property.dao;
import com.manager.estate.feature.property.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
