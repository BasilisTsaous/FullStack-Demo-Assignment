package com.fullstack.demo.rest;

import com.fullstack.demo.dao.FilterStatsDAO;
import com.fullstack.demo.entity.FilterStats;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/filters")
public class FilterStatsController {

    private FilterStatsDAO filterStatsDAO;

    public FilterStatsController(FilterStatsDAO filterStatsDAO) {
        this.filterStatsDAO = filterStatsDAO;
    }

    //Task 3
    @GetMapping("/{Id}/{yearFrom}/{yearTo}")
    public List<FilterStats> getResultsByFilters(@PathVariable Integer Id,@PathVariable Integer yearFrom, @PathVariable Integer yearTo){
        return filterStatsDAO.findStatsByFilters(Id,yearFrom,yearTo);
    }
}
