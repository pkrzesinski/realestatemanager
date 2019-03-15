package com.manager.estate.feature.meter.controller;

import com.manager.estate.feature.meter.model.Meter;
import com.manager.estate.feature.meter.service.MeterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/meters")
@RequiredArgsConstructor
public class MeterController {

    private final MeterService meterService;

    @GetMapping
    public List<Meter> getList() {
        return meterService.getList();
    }

    @PostMapping
    public Meter save(@RequestBody Meter meter) {
        return meterService.save(meter);
    }

    @PutMapping
    public Meter update(@RequestBody Meter meter) {
        return meterService.save(meter);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        meterService.delete(id);
    }
}