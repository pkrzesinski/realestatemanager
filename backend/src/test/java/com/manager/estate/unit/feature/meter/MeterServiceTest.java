package com.manager.estate.unit.feature.meter;

import com.manager.estate.feature.meter.dao.MeterRepository;
import com.manager.estate.feature.meter.model.Meter;
import com.manager.estate.feature.meter.service.MeterService;
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
public class MeterServiceTest {

    @Mock
    private MeterRepository meterRepository;

    @InjectMocks
    private MeterService classUnderTest;

    @Test
    public void shouldGetList() {
        //Given
        List<Meter> meters = createdMockedList();
        when(meterRepository.findAll()).thenReturn(meters);
        //When
        final List<Meter> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldSave() {
        //Given
        Meter meter = new Meter();
        //When
        classUnderTest.save(meter);
        //Then
        verify(meterRepository).save(meter);
    }

    @Test
    public void shouldDelete() {
        //Given
        Long id = 5L;
        //When
        classUnderTest.delete(id);
        //Then
        verify(meterRepository).delete(id);
    }

    public List<Meter> createdMockedList() {
        List<Meter> mockedList = new ArrayList<>();
        mockedList.add(new Meter());
        mockedList.add(new Meter());
        return mockedList;
    }
}