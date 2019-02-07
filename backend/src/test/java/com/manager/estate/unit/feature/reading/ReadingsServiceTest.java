package com.manager.estate.unit.feature.reading;

import com.manager.estate.feature.readings.dao.ReadingsRepository;
import com.manager.estate.feature.readings.model.Readings;
import com.manager.estate.feature.readings.service.ReadingsService;
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
public class ReadingsServiceTest {

    @Mock
    private ReadingsRepository readingRepository;

    @InjectMocks
    private ReadingsService classUnderTest;

    @Test
    public void ShouldGetList() {
        //Given
        List<Readings> readings = createdMockedList();
        when(readingRepository.findAll()).thenReturn(readings);
        //When
        final List<Readings> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldSave() {
        //Given
        Readings reading = new Readings();
        //When
        classUnderTest.save(reading);
        //Then
        verify(readingRepository).save(reading);
    }

    @Test
    public void shouldDelete() {
        //Given
        Long id = 5L;
        //When
        classUnderTest.delete(id);
        //Then
        verify(readingRepository).delete(id);
    }

    public List<Readings> createdMockedList() {
        List<Readings> mockedList = new ArrayList<>();
        mockedList.add(new Readings());
        mockedList.add(new Readings());
        return mockedList;
    }
}