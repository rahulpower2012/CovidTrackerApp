package com.testproj.covidtracker.controllers;

import com.testproj.covidtracker.models.LocationStats;
import com.testproj.covidtracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allstats = covidDataService.getAllStats();
        int totalReportedCases = allstats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        model.addAttribute("locationStats",allstats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        return "home";
    }
}
