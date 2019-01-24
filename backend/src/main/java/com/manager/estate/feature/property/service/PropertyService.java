package com.manager.estate.feature.property.service;
import com.manager.estate.feature.property.dao.PropertyRepository;
import com.manager.estate.feature.property.model.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PropertyService {

    private final PropertyRepository propertyRepository;

    public List<Property> getList() {
        return propertyRepository.findAll();
    }
    public Property save(final Property property) {
        return propertyRepository.save(property);
    }
    public void delete(final Long id) {
        propertyRepository.delete(id);
    }
}