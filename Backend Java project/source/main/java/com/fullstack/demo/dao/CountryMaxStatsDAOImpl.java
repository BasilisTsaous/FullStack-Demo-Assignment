package com.fullstack.demo.dao;

import com.fullstack.demo.entity.CountryMaxStats;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CountryMaxStatsDAOImpl implements CountryMaxStatsDAO {

    public EntityManager entityManager;

    public CountryMaxStatsDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<CountryMaxStats> findMaxRatioPerCountry() {

        String sql = """
                SELECT c.name, c.country_code3, s.year, s.population, s.gdp
                FROM countries c
                JOIN country_stats s ON s.country_id = c.country_id
                JOIN (
                SELECT cs.country_id, cs.year,cs.population,cs.gdp,MAX(cs.gdp /cs.population) AS max_ratio
                FROM country_stats cs
                GROUP BY cs.country_id
                ) m ON m.country_id = s.country_id AND m.max_ratio = (s.gdp/s.population)
                """;

        Query theQuery = entityManager.createNativeQuery(sql);

        List<Object[]> rows = theQuery.getResultList();

        return rows.stream()
                .map(r -> new CountryMaxStats(
                        (String) r[0],  //name
                        (String) r[1],  //country_code3
                        ((Number) r[2]).intValue(), //year
                        ((Number) r[3]).intValue(), //population
                        ((Number) r[4]).longValue() //gdp
                ))
                .collect(Collectors.toList());
    }
}
