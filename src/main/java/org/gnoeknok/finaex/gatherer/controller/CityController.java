/*
 * 2017-03-27 13:49:05.534
 */
package org.gnoeknok.finaex.gatherer.controller;

import java.time.ZonedDateTime;

import org.gnoeknok.finaex.gatherer.entity.City;
import org.gnoeknok.finaex.gatherer.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ethan Lee Kon Keong
 */
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    @ResponseBody
    @Transactional(readOnly = true)
    public String city() {
        City city = cityService.getCity("Bath", "UK");
        if (city != null) {
            return city.getName();
        }
        return "";
    }

    @GetMapping("/read_city")
    @ResponseBody
    @Transactional(readOnly = true)
    public String readCity() {
        City city = cityService.getCity("Alpha", "Alpha");
        if (city != null) {
            return city.toString();
        }
        return "";
    }

    @GetMapping("/save_city")
    @ResponseBody
    @Transactional(readOnly = false)
    public String saveCity() {
        City city = cityService.saveCity("Alpha", ZonedDateTime.now().toString(), "Alpha");
        return city.toString();
    }

}
