package com.fullstack.demo.dao;

import com.fullstack.demo.entity.Language;

import java.util.List;

public interface CountryLangDAO {

    List<Language> findCountryLanguages(Integer id);
}
