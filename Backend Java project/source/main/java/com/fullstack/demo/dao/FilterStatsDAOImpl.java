package com.fullstack.demo.dao;

import com.fullstack.demo.entity.FilterStats;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FilterStatsDAOImpl implements FilterStatsDAO{

    public EntityManager entityManager;

    public FilterStatsDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<FilterStats> findStatsByFilters(Integer Id,Integer yearFrom, Integer yearTo) {

        String sql = """
                SELECT r.name, con.name, c.name , cs.year, cs.population, cs.gdp
                FROM country_stats cs
                JOIN countries c ON c.country_id = cs.country_id
                JOIN regions r ON r.region_id = c.region_id
                JOIN continents con ON con.continent_id = r.continent_id
                WHERE (cs.year >= :yearFrom AND cs.year <= :yearTo) AND r.region_id = :id 
                ORDER BY cs.year ASC;
                """;

        Query theQuery = entityManager.createNativeQuery(sql);

        theQuery.setParameter("id",Id);
        theQuery.setParameter("yearFrom",yearFrom);
        theQuery.setParameter("yearTo",yearTo);

        List<Object[]> rows = theQuery.getResultList();

        return rows.stream()
                .map(r-> new FilterStats(
                        (String) r[0], // name (region)
                        (String) r[1], // name (continent)
                        (String) r[2], // name (country)
                        ((Number) r[3]).intValue(), // year
                        ((Number) r[4]).intValue(), // population
                        ((Number) r[5]).longValue() // gdp
                ))
                .collect(Collectors.toList());
    }
}


