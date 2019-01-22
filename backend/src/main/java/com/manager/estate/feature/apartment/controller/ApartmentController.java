package com.manager.estate.feature.apartment.controller;


import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.apartment.service.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/apartment")
@RequiredArgsConstructor
public class ApartmentController {

    private final ApartmentService apartmentService;

    @GetMapping
    public List<Apartment> getList(){
        return apartmentService.getList();
    }
    @PostMapping
    public Apartment save(@RequestBody Apartment apartment){
        return apartmentService.save(apartment);
    }
    @PutMapping
    public Apartment update(@RequestBody Apartment apartment){
        return apartmentService.save(apartment);
    }
    @DeleteMapping
    public void delete(@PathVariable Long id){
        apartmentService.delete(id);
    }
}
