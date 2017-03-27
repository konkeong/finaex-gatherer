/*
 * 2017-03-25 17:27:36.672
 */
package org.gnoeknok.finaex.gatherer.controller;

import java.lang.invoke.MethodHandles;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ethan Lee Kon Keong
 */
@Controller
public class HeadController {

    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @RequestMapping("/")
    public ModelAndView home(HttpServletRequest request, ModelMap model) {
        ModelAndView mav = new ModelAndView("head");

        mav.addObject("message", "The time now is " + ZonedDateTime.now());
        return mav;
    }

    @RequestMapping("/now")
    public ModelAndView now(HttpServletRequest request, ModelMap model) {
        ModelAndView mav = new ModelAndView("head");

        mav.addObject("message", ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        return mav;
    }

}
