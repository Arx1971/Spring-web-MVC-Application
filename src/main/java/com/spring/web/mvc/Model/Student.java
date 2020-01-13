package com.spring.web.mvc.Model;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private Map<String, String> countryList;
    private String favoriteLanguage;
    private String[] operatingSystem;

    public Student() {
        countryList = new HashMap<>();
        countryList.put("BD", "Bangladesh");
        countryList.put("NZ", "New Zealand");
        countryList.put("USA", "United States of America");
        countryList.put("AUS", "Australia");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getCountryList() {
        return countryList;
    }

    public void setCountryList(Map<String, String> countryList) {
        this.countryList = countryList;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
