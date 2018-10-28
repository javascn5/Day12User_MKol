package com.sda.Day12;

public class Main {

    public static void main(String[] args) {
        Countries countries = new Countries();

        countries.add(new Country("Polska", "Warszawa", 38000, new User("Michal", "Antonov")));
        countries.add(new Country("Niemcy", "Berlin", 54000, new User("Ana", "Bajera")));
        countries.add(new Country("Niemcy", "Berlin", 54000, new User("Ana", "Bajera")));
        countries.add(new Country("Hiszpania", "Madryt", 40000, new User("Barack", "Bezdomny")));
        countries.add(new Country("Czechy", "Praga", 20000, new User("Trener", "Barbarzyńsca")));
        countries.add(new Country("Francja", "Paryż", 70000, new User("Sasha", "Pietrushka")));

        System.out.println(countries.getAllCountries());

        countries.removeCountry("Niemcy");

        System.out.println(countries.getAllCountries());

        //countries.updateCountry("Polska", "Polskaaa");

        System.out.println(countries.getAllCountries());

        countries.getCountry("Hiszpania");
        countries.getCapitalCity("Warszawa");

        System.out.println("Posortowane:");
        System.out.println(countries.getCountriesSortedByPopulation());
    }
}
