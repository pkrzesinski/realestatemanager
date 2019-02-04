package com.manager.estate.feature.reading.service;
import com.manager.estate.feature.reading.dao.MeterValueRepository;
import com.manager.estate.feature.reading.model.ReadingValue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MeterValueService {

    private final MeterValueRepository readingRepository;

    public List<ReadingValue> getList() {
        return readingRepository.findAll();
    }
    public ReadingValue save(ReadingValue reading) {
        return readingRepository.save(reading);
    }
    public void delete(Long id) {
        readingRepository.delete(id);
    }
}