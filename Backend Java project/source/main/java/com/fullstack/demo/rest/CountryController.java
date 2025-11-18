package com.fullstack.demo.rest;

import com.fullstack.demo.dao.CountryDAO;
import com.fullstack.demo.entity.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    private CountryDAO countryDAO;

    public CountryController(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    //Task 1a.
    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countryDAO.findAllCountries();
    }



}
