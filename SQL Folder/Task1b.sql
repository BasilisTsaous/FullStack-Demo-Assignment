SELECT l.*
FROM nation.languages l
JOIN nation.country_languages cl ON cl.language_id = l.language_id
WHERE cl.country_id = :id;