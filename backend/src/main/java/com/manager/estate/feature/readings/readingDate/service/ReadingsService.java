package com.manager.estate.feature.readings.readingDate.service;

import com.manager.estate.feature.readings.readingDate.dao.ReadingsRepository;
import com.manager.estate.feature.readings.readingDate.model.Readings;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReadingsService {
    private final ReadingsRepository readingsRepository;

    public List<Readings> getList() {
        return readingsRepository.findAll();
    }

    public Readings save(final Readings readings) {
        return readingsRepository.save(readings);
    }

    public void delete(final Long id) {
        readingsRepository.delete(id);
    }
}