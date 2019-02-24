package com.manager.estate.integration.feature.property;

import com.manager.estate.feature.property.model.Property;
import com.manager.estate.feature.property.service.PropertyService;
import com.manager.estate.integration.config.Itest;
import com.manager.estate.provider.MockProvider;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolationException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Transactional
public class PropertyItest extends Itest {

    @Autowired
    private PropertyService classUnderTest;

    @Test
    public void shouldFindAll() {
        //Given

        //When
        List<Property> result = classUnderTest.getList();

        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldDelete() {
        //Given

        //When
        classUnderTest.delete(1L);

        //Then
        List<Property> result = classUnderTest.getList();
        assertEquals(1, result.size());
    }

    @Test
    public void shouldSave() {
        //Given
        Property property = MockProvider.getProperties().get(0);

        //When
        classUnderTest.save(property);

        //Then
        List<Property> result = classUnderTest.getList();
        assertEquals(3, result.size());
    }

    @Test(expected = ConstraintViolationException.class)
    public void shouldNotSaveWhenStretIsEmpty() {
        //Given
        Property property = MockProvider.getProperties().get(0);
        property.setStreet("");

        //When
        classUnderTest.save(property);

        //Then
    }

    @Test(expected = ConstraintViolationException.class)
    public void shouldNotSaveWhenBuildingNumberIsEmpty() {
        //Given
        Property property = MockProvider.getProperties().get(0);
        property.setBuildingNumber("");

        //When
        classUnderTest.save(property);

        //Then
    }

    @Test(expected = ConstraintViolationException.class)
    public void shouldNotSaveWhenCityIsEmpty() {
        //Given
        Property property = MockProvider.getProperties().get(0);
        property.setCity("");

        //When
        classUnderTest.save(property);

        //Then
    }

    @Test(expected = ConstraintViolationException.class)
    public void shouldNotSaveWhenPostCodeIsEmpty() {
        //Given
        Property property = MockProvider.getProperties().get(0);
        property.setPostCode("");

        //When
        classUnderTest.save(property);

        //Then
    }
}
