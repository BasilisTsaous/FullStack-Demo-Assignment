package com.fullstack.demo.dao;

import com.fullstack.demo.entity.FilterStats;

import java.util.List;

public interface FilterStatsDAO {

    List<FilterStats> findStatsByFilters(Integer Id, Integer yearFrom, Integer yearTo);
}
