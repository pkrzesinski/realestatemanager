package com.manager.estate.integration.feature.tenant;

import com.manager.estate.feature.apartment.dao.ApartmentRepository;
import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.tenant.model.Tenant;
import com.manager.estate.feature.tenant.service.TenantService;
import com.manager.estate.integration.config.Itest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolationException;
import java.time.LocalDate;

@Transactional
public class TenantITest extends Itest {

    @Autowired
    private ApartmentRepository apartmentRepository;
    @Autowired
    private TenantService classUnderTest;

    @Test(expected = ConstraintViolationException.class)
    public void shouldNotSaveWithoutEmail() {
        //Given
        Apartment apartment = apartmentRepository.findOne(1L);
        Tenant tenant = prepareTenant(apartment);
        tenant.setEmail("");

        //When, Then
        classUnderTest.save(tenant);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void shouldNotSaveDuplicateEmail() {
        //Given
        Apartment apartment = apartmentRepository.findOne(1L);
        Tenant tenant1 = prepareTenant(apartment);
        Tenant tenant2 = prepareTenant(apartment);
        //When, Then
        classUnderTest.save(tenant1);
        classUnderTest.save(tenant2);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void shouldNotSaveTenantWithoutApartment() {
        //Given
        Tenant tenant1 = prepareTenant(null);
        //When, Then
        classUnderTest.save(tenant1);
    }

    private Tenant prepareTenant(Apartment apartment) {
        return new Tenant("Adam", "Kowalski", "adam@kowalski.pl", "500600700",
                "haslo123", "AD 456789", LocalDate.of(1992, 6, 1), apartment);
    }
}