SELECT r.name, con.name, c.name , cs.year, cs.population, cs.gdp
FROM nation.country_stats cs
JOIN nation.countries c ON c.country_id = cs.country_id
JOIN nation.regions r ON r.region_id = c.region_id
JOIN nation.continents con ON con.continent_id = r.continent_id
WHERE (cs.year >= 1980 AND cs.year <= 2000) AND r.region_id = 1  ;



