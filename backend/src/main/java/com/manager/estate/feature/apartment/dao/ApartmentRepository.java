package com.manager.estate.feature.apartment.dao;

import com.manager.estate.feature.apartment.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
