package com.fullstack.demo.rest;

import com.fullstack.demo.dao.CountryLangDAO;
import com.fullstack.demo.entity.Language;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryLangController {

    private CountryLangDAO countryLangDAO;

    public CountryLangController(CountryLangDAO countryLangDAO) {
        this.countryLangDAO = countryLangDAO;
    }

    //Task 1b.
    @GetMapping("/{id}/languages")
    public List<Language> getCountryLanguages(@PathVariable Integer id){
        return countryLangDAO.findCountryLanguages(id);
    }

}
