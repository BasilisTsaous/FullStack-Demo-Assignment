package com.fullstack.demo.dao;

import com.fullstack.demo.entity.Language;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryLangDAOImpl implements CountryLangDAO{

    //Define field for Entity Manager
    public EntityManager entityManager;

    //Define constructor
    public CountryLangDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Language> findCountryLanguages(Integer id) {

        String sql = """
                SELECT l.*
                FROM languages l
                JOIN country_languages cl ON cl.language_id = l.language_id
                WHERE cl.country_id = :id
                """;

        Query theQuery = entityManager.createNativeQuery(sql,Language.class);
        theQuery.setParameter("id",id);
        return theQuery.getResultList();

    }
}