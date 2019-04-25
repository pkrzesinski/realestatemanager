package com.manager.estate;


import com.manager.estate.feature.property.dao.PropertyRepository;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.provider.MockProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Transactional
@RequiredArgsConstructor
public class DataProvider {

    private final PropertyRepository propertyRepository;


    @PostConstruct
    public void initData() {
        final List<Property> residences = savePropertuies();
    }

    private List<Property> savePropertuies() {
        final List<Property> properties = MockProvider.PROPERTIES;
        return propertyRepository.save(properties);
    }
}
