package com.manager.estate.feature.property.controller;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.feature.property.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/properties")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;

    @GetMapping
    public List<Property> getList() {
        return propertyService.getList();
    }
    @PostMapping
    public Property save(@RequestBody Property property) {
        return propertyService.save(property);
    }
    @PutMapping
    public Property update(@RequestBody Property property) {
        return propertyService.save(property);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        propertyService.delete(id);
    }
}