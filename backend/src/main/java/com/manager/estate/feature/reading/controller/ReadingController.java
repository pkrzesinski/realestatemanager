package com.manager.estate.feature.reading.controller;

import com.manager.estate.feature.reading.model.Reading;
import com.manager.estate.feature.reading.service.ReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/reading")
@RequiredArgsConstructor
public class ReadingController {

    private final ReadingService readingService;

    @GetMapping
    public List<Reading> getList() {
        return readingService.getList();
    }

    @PostMapping
    public Reading save(@RequestBody Reading reading) {
        return readingService.save(reading);
    }

    @PutMapping
    public Reading update(@RequestBody Reading reading) {
        return readingService.save(reading);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        readingService.delete(id);
    }
}

