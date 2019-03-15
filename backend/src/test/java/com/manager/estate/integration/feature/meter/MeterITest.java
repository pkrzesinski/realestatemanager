package com.manager.estate.integration.feature.meter;

import com.manager.estate.feature.apartment.dao.ApartmentRepository;
import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.meter.model.Meter;
import com.manager.estate.feature.meter.service.MeterService;
import com.manager.estate.integration.config.Itest;
import com.manager.estate.provider.MockProvider;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolationException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Transactional
public class MeterITest extends Itest {

    @Autowired
    private ApartmentRepository apartmentRepository;
    @Autowired
    private MeterService classUnderTest;

    @Test
    public void shouldSave() {
        //Given
        Meter meter = prepareMeterForTest();

        //When
        classUnderTest.save(meter);

        //Then
        List<Meter> result = classUnderTest.getList();
        assertEquals(1, result.size());
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void ShouldNotSaveTwiceTheSameMeters() {
        //Given
        Meter meter1 = prepareMeterForTest();
        Meter meter2 = prepareMeterForTest();
        //When // Then
        classUnderTest.save(meter1);
        classUnderTest.save(meter2);
    }

    @Test(expected = ConstraintViolationException.class)
    public void ShouldNotAcceptEmptySerialNumber() {
        //Given
        Meter meter = prepareMeterForTest();
        meter.setSerialNumber("");
        //When //Then
        classUnderTest.save(meter);
    }

    public Meter prepareMeterForTest() {

        Meter meter = MockProvider.getMetersForApartment().get(0);
        Apartment apartment = apartmentRepository.findOne(1L);
        meter.setApartment(apartment);
        return meter;
    }
}