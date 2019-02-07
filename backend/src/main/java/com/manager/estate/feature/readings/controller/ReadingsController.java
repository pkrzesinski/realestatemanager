package com.manager.estate.feature.readings.controller;

import com.manager.estate.feature.readings.model.Readings;
import com.manager.estate.feature.readings.service.ReadingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/readings")
@RequiredArgsConstructor
public class ReadingsController {

    private final ReadingsService readingsService;

    @GetMapping
    public List<Readings> getList() {
        return readingsService.getList();
    }
    @PostMapping
    public Readings save(@RequestBody Readings readings) {
        return readingsService.save(readings);
    }
    @PutMapping
    public Readings update(@RequestBody Readings readings) {
        return readingsService.save(readings);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        readingsService.delete(id);
    }
}