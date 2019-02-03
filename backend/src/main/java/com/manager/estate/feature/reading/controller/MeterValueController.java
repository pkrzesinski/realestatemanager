package com.manager.estate.feature.reading.controller;
import com.manager.estate.feature.reading.model.MeterValue;
import com.manager.estate.feature.reading.service.MeterValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/readings")
@RequiredArgsConstructor
public class MeterValueController {

    private final MeterValueService readingService;

    @GetMapping
    public List<MeterValue> getList() {
        return readingService.getList();
    }
    @PostMapping
    public MeterValue save(@RequestBody MeterValue reading) {
        return readingService.save(reading);
    }
    @PutMapping
    public MeterValue update(@RequestBody MeterValue reading) {
        return readingService.save(reading);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        readingService.delete(id);
    }
}