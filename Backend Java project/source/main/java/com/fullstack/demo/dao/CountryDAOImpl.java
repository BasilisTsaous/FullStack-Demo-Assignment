package com.fullstack.demo.dao;

import com.fullstack.demo.entity.Country;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryDAOImpl implements CountryDAO{

    //Define field for Entity Manager
    private EntityManager entityManager;

    //Define constructor
    public CountryDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Country> findAllCountries() {

        TypedQuery<Country> theQuery = entityManager.createQuery("FROM Country c ORDER BY c.name ", Country.class);

        return theQuery.getResultList();
    }
}
