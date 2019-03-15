package com.manager.estate.feature.meter.service;

import com.manager.estate.feature.meter.dao.MeterRepository;
import com.manager.estate.feature.meter.model.Meter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MeterService {

    private final MeterRepository meterRepository;

    public List<Meter> getList() {
        return meterRepository.findAll();
    }

    public Meter save(Meter meter) {
        return meterRepository.save(meter);
    }

    public void delete(Long id) {
        meterRepository.delete(id);
    }
}