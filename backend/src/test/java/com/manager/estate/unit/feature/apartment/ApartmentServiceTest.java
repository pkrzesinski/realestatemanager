package com.manager.estate.unit.feature.apartment;

import com.manager.estate.feature.apartment.dao.ApartmentRepository;
import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.apartment.service.ApartmentService;
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
public class ApartmentServiceTest {

    @Mock
    private ApartmentRepository apartmentRepository;

    @InjectMocks
    private ApartmentService classUnderTest;

    @Test
    public void shouldGetList() {
        //Given
        List<Apartment> apartments = createdMockedList();
        when(apartmentRepository.findAll()).thenReturn(apartments);
        //When
        final List<Apartment> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldSave() {
        //Given
        Apartment apartment = new Apartment();
        //When
        classUnderTest.save(apartment);
        //Then
        verify(apartmentRepository).save(apartment);
    }

    @Test
    public void shouldDelete() {
        //Given
        final Long id = 10L;
        //When
        classUnderTest.delete(id);
        //Then
        verify(apartmentRepository).delete(id);
    }

    public List<Apartment> createdMockedList() {
        List<Apartment> mockedList = new ArrayList<>();
        mockedList.add(new Apartment());
        mockedList.add(new Apartment());
        return mockedList;
    }
}