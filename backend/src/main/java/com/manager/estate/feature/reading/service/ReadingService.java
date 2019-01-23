package com.manager.estate.feature.reading.service;


import com.manager.estate.feature.reading.dao.ReadingRepository;
import com.manager.estate.feature.reading.model.Reading;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReadingService {

    private final ReadingRepository readingRepository;

    public List<Reading> getList() {
        return readingRepository.findAll();
    }

    public Reading save(Reading reading) {
        return readingRepository.save(reading);
    }

    public void delete(Long id) {
        readingRepository.delete(id);
    }

}
