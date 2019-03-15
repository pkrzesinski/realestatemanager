package com.manager.estate.integration.feature.apartment;

import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.apartment.service.ApartmentService;
import com.manager.estate.feature.property.dao.PropertyRepository;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.integration.config.Itest;
import com.manager.estate.provider.MockProvider;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolationException;

import static org.junit.Assert.assertNotNull;

@Transactional
public class ApartmentItest extends Itest {

    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private ApartmentService classUnderTest;


    @Test
    public void shouldSave() {
        //Given
        Apartment apartment = prepareApartmentForTest();

        //When
        classUnderTest.save(apartment);

        //Then
        assertNotNull(apartment.getId());
    }

    @Test
    public void shouldSaveWhenFloorNumberIsNegative() {
        //Given
        Apartment apartment = prepareApartmentForTest();
        apartment.setFloor(-6);

        //When
        classUnderTest.save(apartment);

        //Then
    }

    @Test(expected = ConstraintViolationException.class)
    public void shouldNotSaveWhenSizeIsNegative() {
        //Given
        Apartment apartment = prepareApartmentForTest();
        apartment.setSize(-6.5);

        //When
        classUnderTest.save(apartment);

        //Then
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void shouldNotSaveWhenPropertyIsMissing() {
        //Given
        Apartment apartment = prepareApartmentForTest();
        apartment.setProperty(null);

        //When
        classUnderTest.save(apartment);

        //Then
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void shouldNotSavTwoApartmentsWithSameNumberForOneProperty() {
        //Given
        Apartment apartmentOne = prepareApartmentForTest();
        Apartment apartmentTwo = prepareApartmentForTest();

        //When
        classUnderTest.save(apartmentOne);
        classUnderTest.save(apartmentTwo);
        //Then
    }

    private Apartment prepareApartmentForTest() {
        Apartment apartment = MockProvider.getApartmentsForProperty().get(0);
        // We do this as we need an actual item from DB
        Property property = propertyRepository.findOne(1L);
        apartment.setProperty(property);
        return apartment;
    }
}
