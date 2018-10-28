package com.sda.Day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Countries {
    Set<Country> country = new HashSet<Country>();
    Set<Country> countryCopy = new HashSet<Country>();

    Set<Country> getCountriesSortedByPopulation() {
        int licznik = country.size();
        int iteracje = 0;
        int populacja = 0;
//        Set<Country> panstwo = null;
        for (int i = 0; i < licznik; i++) {
            for (Country key : country) {
                if (iteracje == 0) {
                    countryCopy.add(key);
                    iteracje++;
                    populacja = key.getPopulation();
                    continue;
                }
                if (key.getPopulation() > populacja) {
                    countryCopy.add(key);
                    populacja = key.getPopulation();
                }
            }
        }
        return countryCopy;
    }

    void add(Country panstwo) {
        for (Country key : country) {
            if (key.getName().equals(panstwo.getName())) {
                return;
            }
        }
        country.add(panstwo);
    }

    Set<Country> getAllCountries() {
        return country;
    }

    void removeCountry(String string) {
        if (country.contains(string)) {
            country.remove(string);
        }
    }

    void getCountry(String string) {
        for (Country key : country) {
            if (key.getName().equals(string)) {
                System.out.println(key.getName() + "\t" + key.getCapitalCity() + "\t" + key.getPopulation() + "\tPrezydent: " + key.getPresident().getFirstName() + " " + key.getPresident().getLastName());
            }
        }
    }

    void getCapitalCity(String string) {
        for (Country key : country) {
            if (key.getCapitalCity().equals(string)) {
                System.out.println(key.getName() + "\t" + key.getCapitalCity() + "\t" + key.getPopulation() + "\tPrezydent: " + key.getPresident().getFirstName() + " " + key.getPresident().getLastName());
            }
        }
    }
}
