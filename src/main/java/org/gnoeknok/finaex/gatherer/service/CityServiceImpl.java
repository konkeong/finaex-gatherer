/*
 * 2017-03-27 14:53:03.890
 */
package org.gnoeknok.finaex.gatherer.service;

import java.util.Objects;

import org.gnoeknok.finaex.gatherer.entity.City;
import org.gnoeknok.finaex.gatherer.repository.CityRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ethan Lee Kon Keong
 */
@Component(value = "cityService")
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        Objects.requireNonNull(cityRepository, "cityRepository must not be null");
        this.cityRepository = cityRepository;
    }

    @Override
    public City getCity(String name, String country) {
        Objects.requireNonNull(name, "Name must not be null");
        Objects.requireNonNull(country, "Country must not be null");
        return cityRepository.findByNameAndCountryAllIgnoringCase(name, country);
    }

    @Override
    public City saveCity(String name, String state, String country) {
        Objects.requireNonNull(name, "Name must not be null");
        Objects.requireNonNull(country, "Country must not be null");
        City city = cityRepository.findByNameAndCountryAllIgnoringCase(name, country);
        if (city == null) {
            city = new City(null, name, state, country);
        } else {
            city.setName(name);
            city.setState(state);
            city.setCountry(country);
        }
        return cityRepository.save(city);
    }

}
