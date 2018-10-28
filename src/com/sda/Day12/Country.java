package com.sda.Day12;

public class Country {
    private String name;
    private String capitalCity;
    private int population;
    private User president;

    public Country(String name, String capitalCity, int population, User president) {
        this.name = name;
        this.capitalCity = capitalCity;
        this.population = population;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public User getPresident() {
        return president;
    }

    public void setPresident(User president) {
        this.president = president;
    }

    @Override
    public String toString() {
        return "Nazwa: " + name + "\tStolica: " + capitalCity + "\tPopulacja: " + population + "\tPrezydent: " + president.getFirstName() + " " + president.getLastName() + "\n";
    }
}
