package com.manager.estate.unit.config;

import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.mediaType.MediaType;
import com.manager.estate.feature.meter.model.Meter;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.feature.readings.readingDate.model.Readings;
import com.manager.estate.feature.readings.readingValue.model.ReadingValue;
import com.manager.estate.feature.tenant.model.Tenant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockProvider {
    public static final List<Property> PROPERTIES = getProperties();
    public static final List<Apartment> APARTMENTS = getApartmentsForProperty();
    public static final List<Meter> METERS = getMetersForApartment();
    public static final List<Tenant> TENANTS = getTenantsForApartment();
    public static final List<ReadingValue> READING_VALUES_JANUARY = getReadingValuesForJanuary();
    public static final List<ReadingValue> READING_VALUES_MARCH = getReadingValuesForMarch();
    public static final List<ReadingValue> READING_VALUES_JUNE = getReadingValuesForJune();
    public static final List<Readings> READINGS = getReadingForMeterReadings();

    private static List<Property> getProperties() {
        List<Property> properties = new ArrayList<>();
        Property property1 = new Property(1L, "Świętojańska", "13", "Gdynia", "81-364");
        properties.addAll(Arrays.asList(property1));
        return properties;
    }

    private static List<Apartment> getApartmentsForProperty() {
        List<Apartment> apartments = new ArrayList<>();

        Apartment apartment1 = new Apartment(1L, "1", -1, 2, 38.5, "Basement", PROPERTIES.get(0));
        Apartment apartment2 = new Apartment(2L, "2", 0, 1, 22.5, "Ground Floor", PROPERTIES.get(0));
        Apartment apartment3 = new Apartment(3L, "3", 1, 3, 65.0, "1st floor", PROPERTIES.get(0));
        Apartment apartment4 = new Apartment(4L, "4", 2, 5, 150.3, "2nd floor", PROPERTIES.get(0));
        apartments.addAll(Arrays.asList(apartment1, apartment2, apartment3, apartment4));
        return apartments;
    }

    private static List<Tenant> getTenantsForApartment() {
        List<Tenant> tenants = new ArrayList<>();

        Tenant tenant1 = new Tenant(1L, "Adam", "Kowalski", "adam@kowalski.pl", "500600700",
                "haslo123", "AD 456789", LocalDate.of(1992, 6, 1), APARTMENTS.get(0));
        Tenant tenant2 = new Tenant(2L, "Anna", "Nowak", "Anna@Nowak.pl", "+48 502 756 723",
                "Anna123", "AD098293", LocalDate.of(1965, 4, 23), APARTMENTS.get(1));
        Tenant tenant3 = new Tenant(3L, "Karol", "Smith", "Smith.karol@wp.pl", "665743934",
                "123456", "YH 765783", LocalDate.of(1994, 1, 1), APARTMENTS.get(2));
        Tenant tenant4 = new Tenant(4L, "Paweł", "Wójcik", "Wojcik@gmail.com", "50208214",
                "Password123", "AG 0929454", LocalDate.of(1992, 5, 29), APARTMENTS.get(3));
        tenants.addAll(Arrays.asList(tenant1, tenant2, tenant3, tenant4));
        return tenants;
    }

    private static List<Meter> getMetersForApartment() {
        List<Meter> meters = new ArrayList<>();

        Meter water1 = new Meter(1L, "12345", MediaType.WATER, APARTMENTS.get(0));
        Meter gas1 = new Meter(2L, "456", MediaType.GAS, APARTMENTS.get(0));
        Meter electricity1 = new Meter(3L, "8753", MediaType.ELECTRICITY, APARTMENTS.get(0));
        Meter water2 = new Meter(4L, "abcde", MediaType.WATER, APARTMENTS.get(1));
        Meter gas2 = new Meter(5L, "kjlfk", MediaType.GAS, APARTMENTS.get(1));
        Meter electricity2 = new Meter(6L, "876yhg", MediaType.ELECTRICITY, APARTMENTS.get(1));
        Meter water3 = new Meter(7L, "73urh", MediaType.WATER, APARTMENTS.get(2));
        Meter gas3 = new Meter(8L, "ubgh34", MediaType.GAS, APARTMENTS.get(2));
        Meter electricity3 = new Meter(9L, "657wufe", MediaType.ELECTRICITY, APARTMENTS.get(2));
        Meter water4 = new Meter(10L, "54rf43", MediaType.WATER, APARTMENTS.get(3));
        Meter gas4 = new Meter(11L, "4324f45", MediaType.GAS, APARTMENTS.get(3));
        Meter electricity4 = new Meter(12L, "ger234", MediaType.ELECTRICITY, APARTMENTS.get(3));
        meters.addAll(Arrays.asList(water1, gas1, electricity1, water2, gas2, electricity2, water3, gas3, electricity3,
                water4, gas4, electricity4));
        return meters;
    }

    private static List<ReadingValue> getReadingValuesForJanuary() {
        List<ReadingValue> readingValuesJanuary = new ArrayList<>();
        ReadingValue readingWater1Ap1 = new ReadingValue(1L, METERS.get(0), 34.2);
        ReadingValue readingWater1Ap2 = new ReadingValue(4L, METERS.get(3), 100.3);
        ReadingValue readingWater1Ap3 = new ReadingValue(7L, METERS.get(6), 324.2);
        ReadingValue readingWater1Ap4 = new ReadingValue(10L, METERS.get(9), 65.3);
        readingValuesJanuary.addAll(Arrays.asList(readingWater1Ap1, readingWater1Ap2, readingWater1Ap3, readingWater1Ap4));
        return readingValuesJanuary;
    }

    public static List<ReadingValue> getReadingValuesForMarch() {
        List<ReadingValue> readingValuesMarches = new ArrayList<>();
        ReadingValue readingWater2Ap1 = new ReadingValue(2L, METERS.get(0), 43.5);
        ReadingValue readingWater2Ap2 = new ReadingValue(3L, METERS.get(3), 150.2);
        ReadingValue readingWater2Ap3 = new ReadingValue(8L, METERS.get(6), 453.5);
        ReadingValue readingWater2Ap4 = new ReadingValue(11L, METERS.get(9), 74.4);
        readingValuesMarches.addAll(Arrays.asList(readingWater2Ap1, readingWater2Ap2, readingWater2Ap3, readingWater2Ap4));
        return readingValuesMarches;
    }

    public static List<ReadingValue> getReadingValuesForJune() {
        List<ReadingValue> readingValuesJune = new ArrayList<>();
        ReadingValue readingWater3Ap1 = new ReadingValue(3L, METERS.get(0), 56.3);
        ReadingValue readingWater3Ap2 = new ReadingValue(6L, METERS.get(3), 204.9);
        ReadingValue readingWater3Ap3 = new ReadingValue(9L, METERS.get(6), 566.3);
        ReadingValue readingWater3Ap4 = new ReadingValue(12L, METERS.get(9), 100.9);
        readingValuesJune.addAll(Arrays.asList(readingWater3Ap1, readingWater3Ap2, readingWater3Ap3, readingWater3Ap4));
        return readingValuesJune;
    }

    public static List<Readings> getReadingForMeterReadings() {
        List<Readings> readings = new ArrayList<>();

        Readings readingDate1 = new Readings(1L, LocalDate.of(2018, 01, 20),
                getReadingValuesForJanuary(), MediaType.WATER);

        Readings readingDate2 = new Readings(2L, LocalDate.of(2018, 03, 21),
                getReadingValuesForMarch(), MediaType.WATER);

        Readings readingDate3 = new Readings(3L, LocalDate.of(2018, 06, 3),
                getReadingValuesForJune(), MediaType.WATER);
        readings.addAll(Arrays.asList(readingDate1, readingDate2, readingDate3));
        return readings;
    }
}