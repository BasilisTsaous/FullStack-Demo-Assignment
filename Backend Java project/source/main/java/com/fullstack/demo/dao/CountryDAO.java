package com.fullstack.demo.dao;

import com.fullstack.demo.entity.Country;

import java.util.List;

public interface CountryDAO {

    List<Country> findAllCountries();
}
