package com.manager.estate.feature.apartment.service;
import com.manager.estate.feature.apartment.dao.ApartmentRepository;
import com.manager.estate.feature.apartment.model.Apartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;

    public List<Apartment> getList(){
        return apartmentRepository.findAll();
    }
    public Apartment save(final Apartment apartment){
        return apartmentRepository.save(apartment);
    }
    public void delete(final Long id){
        apartmentRepository.delete(id);
    }
}