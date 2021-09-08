package com.testproj.covidtracker.models;

import javax.xml.transform.sax.SAXResult;

public class LocationStats {
    private  String state;
    private String country;
    private int latestTotalCases;
    private int diffFrompreviousDay;

    public int getDiffFrompreviousDay() {
        return diffFrompreviousDay;
    }

    public void setDiffFrompreviousDay(int diffFrompreviousDay) {
        this.diffFrompreviousDay = diffFrompreviousDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
