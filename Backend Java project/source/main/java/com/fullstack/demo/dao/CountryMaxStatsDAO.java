package com.fullstack.demo.dao;

import com.fullstack.demo.entity.CountryMaxStats;

import java.util.List;

public interface CountryMaxStatsDAO {

    List<CountryMaxStats> findMaxRatioPerCountry();
}
