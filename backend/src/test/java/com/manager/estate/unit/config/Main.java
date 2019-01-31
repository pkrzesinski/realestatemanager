package com.manager.estate.unit.config;

import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.mediaType.MediaType;
import com.manager.estate.feature.meter.model.Meter;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.feature.reading.model.Reading;
import com.manager.estate.feature.readingDate.ReadingDate;
import com.manager.estate.feature.tenant.model.Tenant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Property> getProperties() {
        List<Property> properties = new ArrayList<>();
        Property property1 = new Property(1L, "Świętojańska", "13", "Gdynia", "81-364");
        properties.addAll(Arrays.asList(property1));
        return properties;
    }

    public static List<Apartment> getApartmentsForProperty() {
        List<Apartment> apartments = new ArrayList<>();

        Apartment apartment1 = new Apartment(1L, "1", -1, 2, 38.5, "Basement", getProperties().get(0));
        Apartment apartment2 = new Apartment(2L, "2", 0, 1, 22.5, "Ground Floor", getProperties().get(0));
        Apartment apartment3 = new Apartment(3L, "3", 1, 3, 65.0, "1st floor", getProperties().get(0));
        Apartment apartment4 = new Apartment(4L, "4", 2, 5, 150.3, "2nd floor", getProperties().get(0));
        apartments.addAll(Arrays.asList(apartment1, apartment2, apartment3, apartment4));
        return apartments;
    }

    public static List<Tenant> getTenantsForApartment() {
        List<Tenant> tenants = new ArrayList<>();

        Tenant tenant1 = new Tenant(1L, "Adam", "Kowalski", "adam@kowalski.pl", "500600700",
                "haslo123", "AD 456789", LocalDate.of(1992, 6, 1), getApartmentsForProperty().get(0));
        Tenant tenant2 = new Tenant(2L, "Anna", "Nowak", "Anna@Nowak.pl", "+48 502 756 723",
                "Anna123", "AD098293", LocalDate.of(1965, 4, 23), getApartmentsForProperty().get(1));
        Tenant tenant3 = new Tenant(3L, "Karol", "Smith", "Smith.karol@wp.pl", "665743934",
                "123456", "YH 765783", LocalDate.of(1994, 1, 1), getApartmentsForProperty().get(2));
        Tenant tenant4 = new Tenant(4L, "Paweł", "Wójcik", "Wojcik@gmail.com", "50208214",
                "Password123", "AG 0929454", LocalDate.of(1992, 5, 29), getApartmentsForProperty().get(3));
        tenants.addAll(Arrays.asList(tenant1, tenant2, tenant3, tenant4));
        return tenants;
    }

    public static List<Meter> getMetersForApartment() {
        List<Meter> meters = new ArrayList<>();

        Meter water1 = new Meter(1L, "12345", MediaType.WATER, getApartmentsForProperty().get(0));
        Meter gas1 = new Meter(2L, "456", MediaType.GAS, getApartmentsForProperty().get(0));
        Meter electricity1 = new Meter(3L, "8753", MediaType.ELECTRICITY, getApartmentsForProperty().get(0));
        Meter water2 = new Meter(4L, "abcde", MediaType.WATER, getApartmentsForProperty().get(1));
        Meter gas2 = new Meter(5L, "kjlfk", MediaType.GAS, getApartmentsForProperty().get(1));
        Meter electricity2 = new Meter(6L, "876yhg", MediaType.ELECTRICITY, getApartmentsForProperty().get(1));
        Meter water3 = new Meter(7L, "73urh", MediaType.WATER, getApartmentsForProperty().get(2));
        Meter gas3 = new Meter(8L, "ubgh34", MediaType.GAS, getApartmentsForProperty().get(2));
        Meter electricity3 = new Meter(9L, "657wufe", MediaType.ELECTRICITY, getApartmentsForProperty().get(2));
        Meter water4 = new Meter(10L, "54rf43", MediaType.WATER, getApartmentsForProperty().get(3));
        Meter gas4 = new Meter(11L, "4324f45", MediaType.GAS, getApartmentsForProperty().get(3));
        Meter electricity4 = new Meter(12L, "ger234", MediaType.ELECTRICITY, getApartmentsForProperty().get(3));
        meters.addAll(Arrays.asList(water1, gas1, electricity1, water2, gas2, electricity2, water3, gas3, electricity3,
                water4, gas4, electricity4));
        return meters;
    }

    public static List<List<Reading>> getReadingsForApartment() {
        List<List<Reading>> readings = new ArrayList<>();

        Reading readingWater1Ap1 = new Reading(1L, getMetersForApartment().get(0), 34.2);
        Reading readingWater2Ap1 = new Reading(2L, getMetersForApartment().get(0), 43.5);
        Reading readingWater3Ap1 = new Reading(3L, getMetersForApartment().get(0), 56.3);

        Reading readingWater1Ap2 = new Reading(4L, getMetersForApartment().get(3), 100.3);
        Reading readingWater2Ap2 = new Reading(5L, getMetersForApartment().get(3), 150.4);
        Reading readingWater3Ap2 = new Reading(6L, getMetersForApartment().get(3), 204.9);

        Reading readingWater1Ap3 = new Reading(7L, getMetersForApartment().get(6), 324.2);
        Reading readingWater2Ap3 = new Reading(8L, getMetersForApartment().get(6), 453.5);
        Reading readingWater3Ap3 = new Reading(9L, getMetersForApartment().get(6), 566.3);

        Reading readingWater1Ap4 = new Reading(10L, getMetersForApartment().get(9), 65.3);
        Reading readingWater2Ap4 = new Reading(11L, getMetersForApartment().get(9), 74.4);
        Reading readingWater3Ap4 = new Reading(12L, getMetersForApartment().get(9), 100.9);

        List<Reading> readingsWater1 = new ArrayList<>();
        readingsWater1.addAll(Arrays.asList(readingWater1Ap1, readingWater1Ap2, readingWater1Ap3, readingWater1Ap4));
        List<Reading> readingsWater2 = new ArrayList<>();
        readingsWater2.addAll(Arrays.asList(readingWater2Ap1, readingWater2Ap2, readingWater2Ap3, readingWater2Ap4));
        List<Reading> readingsWater3 = new ArrayList<>();
        readingsWater3.addAll(Arrays.asList(readingWater3Ap1, readingWater3Ap2, readingWater3Ap3, readingWater3Ap4));

        readings.add(readingsWater1);
        readings.add(readingsWater2);
        readings.add(readingsWater3);
        return readings;
    }

    public static List<ReadingDate> getReadingDatesforReading() {
        List<ReadingDate> readingDates = new ArrayList<>();

        ReadingDate readingDate1 = new ReadingDate(1L, LocalDate.of(2018, 01, 20),
                getReadingsForApartment().get(0), MediaType.WATER);

        ReadingDate readingDate2 = new ReadingDate(2L, LocalDate.of(2018, 03, 21),
                getReadingsForApartment().get(1), MediaType.WATER);

        ReadingDate readingDate3 = new ReadingDate(3L, LocalDate.of(2018, 06, 3),
                getReadingsForApartment().get(2), MediaType.WATER);
        readingDates.addAll(Arrays.asList(readingDate1, readingDate2, readingDate3));
        return readingDates;
    }
}