SELECT c.name, c.country_code3, s.year, s.population, s.gdp
FROM nation.countries c
JOIN nation.country_stats s ON s.country_id = c.country_id
JOIN (
SELECT cs.country_id, cs.year, cs.population, cs.gdp, MAX(cs.gdp /cs.population) AS max_ratio
FROM nation.country_stats cs
GROUP BY cs.country_id
) m ON m.country_id = s.country_id AND m.max_ratio = (s.gdp/s.population);

