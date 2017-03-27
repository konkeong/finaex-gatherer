/*
 * 2017-03-27 13:51:07.022
 */
package org.gnoeknok.finaex.gatherer.service;

import org.gnoeknok.finaex.gatherer.entity.City;

/**
 *
 * @author Ethan Lee Kon Keong
 */
public interface CityService {

    public City getCity(String name, String country);

    public City saveCity(String name, String state, String country);

}
