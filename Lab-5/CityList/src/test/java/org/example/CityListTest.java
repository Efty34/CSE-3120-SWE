package org.example;

import org.example.City;
import org.example.CityList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {
    @Test
    void testDelete() {
        CityList cityList = new CityList();
        City city = new City("Test City", "Test Province");
        cityList.add(city);
        cityList.delete(city);
        assertEquals(0, cityList.count());
    }

    @Test
    void testDeleteException() {
        CityList cityList = new CityList();
        City city = new City("Test City", "Test Province");
        assertThrows(IllegalArgumentException.class, () -> cityList.delete(city));
    }

    @Test
    void testCount() {
        CityList cityList = new CityList();
        City city1 = new City("Test City 1", "Test Province");
        City city2 = new City("Test City 2", "Test Province");
        cityList.add(city1);
        cityList.add(city2);
        assertEquals(2, cityList.count());
    }

    @Test
    void testSort() {
        CityList cityList = new CityList();
        City city1 = new City("B City", "A Province");
        City city2 = new City("A City", "B Province");
        cityList.add(city1);
        cityList.add(city2);
        assertEquals("A City", cityList.getCities("city").get(0).getCityName());
        assertEquals("A Province", cityList.getCities("province").get(0).getProvinceName());
    }
}