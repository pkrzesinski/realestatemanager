package com.manager.estate.unit.feature.reading;

import com.manager.estate.feature.reading.dao.ReadingRepository;
import com.manager.estate.feature.reading.model.Reading;
import com.manager.estate.feature.reading.service.ReadingService;
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
public class ReadingServiceTest {

    @Mock
    private ReadingRepository readingRepository;

    @InjectMocks
    private ReadingService classUnderTest;

    @Test
    public void ShouldGetList() {
        //Given
        List<Reading> readings = createdMockedList();
        when(readingRepository.findAll()).thenReturn(readings);
        //When
        final List<Reading> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldSave() {
        //Given
        Reading reading = new Reading();
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

    public List<Reading> createdMockedList() {
        List<Reading> mockedList = new ArrayList<>();
        mockedList.add(new Reading());
        mockedList.add(new Reading());
        return mockedList;
    }
}