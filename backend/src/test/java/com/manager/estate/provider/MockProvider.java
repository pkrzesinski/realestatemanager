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
        Tenant tenant1 = new Tenant("Adam", "Kowalski", "adam@kowalski.pl", "500600700",
                "haslo123", "AD 456789", LocalDate.of(1992, 6, 1), APARTMENTS.get(0));
        Tenant tenant2 = new Tenant("Anna", "Nowak", "Anna@Nowak.pl", "+48 502 756 723",
                "Anna123", "AD098293", LocalDate.of(1965, 4, 23), APARTMENTS.get(1));
        Tenant tenant3 = new Tenant("Karol", "Smith", "Smith.karol@wp.pl", "665743934",
                "123456", "YH 765783", LocalDate.of(1994, 1, 1), APARTMENTS.get(2));
        Tenant tenant4 = new Tenant("Paweł", "Wójcik", "Wojcik@gmail.com", "50208214",
                "Password123", "AG 0929454", LocalDate.of(1992, 5, 29), APARTMENTS.get(3));
        return Lists.newArrayList(tenant1, tenant2, tenant3, tenant4);
    }

    public static List<Meter> getMetersForApartment() {
        Meter water1 = new Meter("12345", MediaType.WATER, APARTMENTS.get(0));
        Meter gas1 = new Meter("456", MediaType.GAS, APARTMENTS.get(0));
        Meter electricity1 = new Meter("8753", MediaType.ELECTRICITY, APARTMENTS.get(0));
        Meter water2 = new Meter("abcde", MediaType.WATER, APARTMENTS.get(1));
        Meter gas2 = new Meter("kjlfk", MediaType.GAS, APARTMENTS.get(1));
        Meter electricity2 = new Meter("876yhg", MediaType.ELECTRICITY, APARTMENTS.get(1));
        Meter water3 = new Meter("73urh", MediaType.WATER, APARTMENTS.get(2));
        Meter gas3 = new Meter("ubgh34", MediaType.GAS, APARTMENTS.get(2));
        Meter electricity3 = new Meter("657wufe", MediaType.ELECTRICITY, APARTMENTS.get(2));
        Meter water4 = new Meter("54rf43", MediaType.WATER, APARTMENTS.get(3));
        Meter gas4 = new Meter("4324f45", MediaType.GAS, APARTMENTS.get(3));
        Meter electricity4 = new Meter("ger234", MediaType.ELECTRICITY, APARTMENTS.get(3));
        return Lists.newArrayList(water1, gas1, electricity1, water2, gas2, electricity2, water3, gas3, electricity3, water4, gas4, electricity4);
    }

    private static List<ReadingValue> getReadingValuesForJanuary() {
        ReadingValue readingWater1Ap1 = new ReadingValue(METERS.get(0), 34.2);
        ReadingValue readingWater1Ap2 = new ReadingValue(METERS.get(3), 100.3);
        ReadingValue readingWater1Ap3 = new ReadingValue(METERS.get(6), 324.2);
        ReadingValue readingWater1Ap4 = new ReadingValue(METERS.get(9), 65.3);
        return Lists.newArrayList(readingWater1Ap1, readingWater1Ap2, readingWater1Ap3, readingWater1Ap4);
    }

    private static List<ReadingValue> getReadingValuesForMarch() {
        ReadingValue readingWater2Ap1 = new ReadingValue(METERS.get(0), 43.5);
        ReadingValue readingWater2Ap2 = new ReadingValue(METERS.get(3), 150.2);
        ReadingValue readingWater2Ap3 = new ReadingValue(METERS.get(6), 453.5);
        ReadingValue readingWater2Ap4 = new ReadingValue(METERS.get(9), 74.4);
        return Lists.newArrayList(readingWater2Ap1, readingWater2Ap2, readingWater2Ap3, readingWater2Ap4);
    }

    private static List<ReadingValue> getReadingValuesForJune() {
        ReadingValue readingWater3Ap1 = new ReadingValue(METERS.get(0), 56.3);
        ReadingValue readingWater3Ap2 = new ReadingValue(METERS.get(3), 204.9);
        ReadingValue readingWater3Ap3 = new ReadingValue(METERS.get(6), 566.3);
        ReadingValue readingWater3Ap4 = new ReadingValue(METERS.get(9), 100.9);
        return Lists.newArrayList(readingWater3Ap1, readingWater3Ap2, readingWater3Ap3, readingWater3Ap4);
    }

    private static List<Readings> getReadingForMeterReadings() {
        Readings readingDate1 = new Readings(LocalDate.of(2018, 1, 20),
                getReadingValuesForJanuary(), MediaType.WATER);
        Readings readingDate2 = new Readings(LocalDate.of(2018, 3, 21),
                getReadingValuesForMarch(), MediaType.WATER);
        Readings readingDate3 = new Readings(LocalDate.of(2018, 6, 3),
                getReadingValuesForJune(), MediaType.WATER);
        return Lists.newArrayList(readingDate1, readingDate2, readingDate3);
    }
}