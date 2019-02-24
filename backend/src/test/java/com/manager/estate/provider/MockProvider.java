package com.manager.estate.provider;

import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.mediaType.MediaType;
import com.manager.estate.feature.meter.model.Meter;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.feature.readings.model.ReadingValue;
import com.manager.estate.feature.readings.model.Readings;
import com.manager.estate.feature.tenant.model.Tenant;
import org.assertj.core.util.Lists;

import java.time.LocalDate;
import java.util.ArrayList;
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

    public static List<Property> getProperties() {
        List<Property> properties = new ArrayList<>();
        properties.add(new Property("Świętojańska", "13", "Gdynia", "81-364"));
        return properties;
    }

    public static List<Apartment> getApartmentsForProperty() {
        Apartment apartment1 = new Apartment("1", 0, 2, 38.5, "Basement", PROPERTIES.get(0));
        Apartment apartment2 = new Apartment("2", 1, 1, 22.5, "Ground Floor", PROPERTIES.get(0));
        Apartment apartment3 = new Apartment("3", 2, 3, 65.0, "1st floor", PROPERTIES.get(0));
        Apartment apartment4 = new Apartment("4", 3, 5, 150.3, "2nd floor", PROPERTIES.get(0));
        return Lists.newArrayList(apartment1, apartment2, apartment3, apartment4);
    }

    private static List<Tenant> getTenantsForApartment() {
        Tenant tenant1 = new Tenant(1L, "Adam", "Kowalski", "adam@kowalski.pl", "500600700",
                "haslo123", "AD 456789", LocalDate.of(1992, 6, 1), APARTMENTS.get(0));
        Tenant tenant2 = new Tenant(2L, "Anna", "Nowak", "Anna@Nowak.pl", "+48 502 756 723",
                "Anna123", "AD098293", LocalDate.of(1965, 4, 23), APARTMENTS.get(1));
        Tenant tenant3 = new Tenant(3L, "Karol", "Smith", "Smith.karol@wp.pl", "665743934",
                "123456", "YH 765783", LocalDate.of(1994, 1, 1), APARTMENTS.get(2));
        Tenant tenant4 = new Tenant(4L, "Paweł", "Wójcik", "Wojcik@gmail.com", "50208214",
                "Password123", "AG 0929454", LocalDate.of(1992, 5, 29), APARTMENTS.get(3));
        return Lists.newArrayList(tenant1, tenant2, tenant3, tenant4);
    }

    private static List<Meter> getMetersForApartment() {
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
        return Lists.newArrayList(water1, gas1, electricity1, water2, gas2, electricity2, water3, gas3, electricity3, water4, gas4, electricity4);
    }

    private static List<ReadingValue> getReadingValuesForJanuary() {
        ReadingValue readingWater1Ap1 = new ReadingValue(1L, METERS.get(0), 34.2);
        ReadingValue readingWater1Ap2 = new ReadingValue(4L, METERS.get(3), 100.3);
        ReadingValue readingWater1Ap3 = new ReadingValue(7L, METERS.get(6), 324.2);
        ReadingValue readingWater1Ap4 = new ReadingValue(10L, METERS.get(9), 65.3);
        return Lists.newArrayList(readingWater1Ap1, readingWater1Ap2, readingWater1Ap3, readingWater1Ap4);
    }

    private static List<ReadingValue> getReadingValuesForMarch() {
        ReadingValue readingWater2Ap1 = new ReadingValue(2L, METERS.get(0), 43.5);
        ReadingValue readingWater2Ap2 = new ReadingValue(3L, METERS.get(3), 150.2);
        ReadingValue readingWater2Ap3 = new ReadingValue(8L, METERS.get(6), 453.5);
        ReadingValue readingWater2Ap4 = new ReadingValue(11L, METERS.get(9), 74.4);
        return Lists.newArrayList(readingWater2Ap1, readingWater2Ap2, readingWater2Ap3, readingWater2Ap4);
    }

    private static List<ReadingValue> getReadingValuesForJune() {
        ReadingValue readingWater3Ap1 = new ReadingValue(3L, METERS.get(0), 56.3);
        ReadingValue readingWater3Ap2 = new ReadingValue(6L, METERS.get(3), 204.9);
        ReadingValue readingWater3Ap3 = new ReadingValue(9L, METERS.get(6), 566.3);
        ReadingValue readingWater3Ap4 = new ReadingValue(12L, METERS.get(9), 100.9);
        return Lists.newArrayList(readingWater3Ap1, readingWater3Ap2, readingWater3Ap3, readingWater3Ap4);
    }

    private static List<Readings> getReadingForMeterReadings() {
        Readings readingDate1 = new Readings(1L, LocalDate.of(2018, 1, 20),
                getReadingValuesForJanuary(), MediaType.WATER);
        Readings readingDate2 = new Readings(2L, LocalDate.of(2018, 3, 21),
                getReadingValuesForMarch(), MediaType.WATER);
        Readings readingDate3 = new Readings(3L, LocalDate.of(2018, 6, 3),
                getReadingValuesForJune(), MediaType.WATER);
        return Lists.newArrayList(readingDate1, readingDate2, readingDate3);
    }
}