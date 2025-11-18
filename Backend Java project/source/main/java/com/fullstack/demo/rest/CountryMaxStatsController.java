package com.fullstack.demo.rest;

import com.fullstack.demo.dao.CountryMaxStatsDAO;
import com.fullstack.demo.entity.CountryMaxStats;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stats")
public class CountryMaxStatsController {

    private CountryMaxStatsDAO countryMaxStatsDAO;

    public CountryMaxStatsController(CountryMaxStatsDAO countryMaxStatsDAO) {
        this.countryMaxStatsDAO = countryMaxStatsDAO;
    }

    //Task 2
    @GetMapping("/max_ratio")
    public List<CountryMaxStats>  getMaxRationPerCountry(){
        return countryMaxStatsDAO.findMaxRatioPerCountry();
    }

}