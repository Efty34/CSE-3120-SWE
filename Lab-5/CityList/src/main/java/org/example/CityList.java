package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();

    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Deletes a city from the list
     * @param city The city to delete
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the total number of cities
     * @return The total number of cities
     */
    public int count() {
        return cities.size();
    }

    /**
     * Returns a sorted list of cities by city name or province name
     * @param sortBy The parameter to sort by - "city" or "province"
     * @return The sorted list of cities
     */
    public List<City> getCities(String sortBy) {
        List<City> cityList = new ArrayList<>(cities);
        if ("city".equals(sortBy)) {
            cityList.sort(Comparator.comparing(City::getCityName));
        } else if ("province".equals(sortBy)) {
            cityList.sort(Comparator.comparing(City::getProvinceName));
        }
        return cityList;
    }
}