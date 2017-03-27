/*
 * 2017-03-27 14:51:27.673
 */
package org.gnoeknok.finaex.gatherer.repository;

import org.gnoeknok.finaex.gatherer.entity.City;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Ethan Lee Kon Keong
 */
public interface CityRepository extends Repository<City, Long> {

    public City findByNameAndCountryAllIgnoringCase(String name, String country);

    public City save(City city);

}
