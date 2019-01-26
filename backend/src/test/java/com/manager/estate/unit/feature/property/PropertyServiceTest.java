package com.manager.estate.unit.feature.property;

import com.manager.estate.feature.property.dao.PropertyRepository;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.feature.property.service.PropertyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PropertyServiceTest {

    @Mock
    private PropertyRepository propertyRepository;

    @InjectMocks
    private PropertyService classUnderTest;


    @Test
    public void shouldSave() {
        //Given
        Property property = new Property();
        //When
        classUnderTest.save(property);
        //Then
        verify(propertyRepository).save(property);
    }

    @Test
    public void shouldDelete() {
        //Given
        final Long id = 5L;
        //When
        classUnderTest.delete(id);
        //Then
        verify(propertyRepository).delete(id);
    }

    @Test
    public void shouldGetList() {
        //Given
        List<Property> properties = createdMockedList();
        when(propertyRepository.findAll()).thenReturn(properties);
        //When
        final List<Property> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    private List<Property> createdMockedList() {
        List<Property> mockedList = new ArrayList<>();
        mockedList.add(new Property());
        mockedList.add(new Property());
        return mockedList;
    }
}