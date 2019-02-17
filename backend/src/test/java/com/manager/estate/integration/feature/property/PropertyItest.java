package com.manager.estate.integration.feature.property;

import com.manager.estate.feature.property.model.Property;
import com.manager.estate.feature.property.service.PropertyService;
import com.manager.estate.integration.config.Itest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

@Transactional
public class PropertyItest extends Itest {

    @Autowired
    private PropertyService classUnderTest;

    @Test
    public void shouldFindAll() {
        List<Property> result = classUnderTest.getList();
        assertEquals(2, result.size());
    }

    @Test
    public void shouldDelete() {
        classUnderTest.delete(1L);
        List<Property> result = classUnderTest.getList();
        assertEquals(1, result.size());
    }

    @Test
    public void shouldSave() {
        Property property = Property.builder().city("Warszawa").buildingNumber("12").build();
        classUnderTest.save(property);
        List<Property> result = classUnderTest.getList();
        assertEquals(3, result.size());
    }

}
