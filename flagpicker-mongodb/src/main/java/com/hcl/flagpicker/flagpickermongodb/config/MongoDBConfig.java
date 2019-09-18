package com.hcl.flagpicker.flagpickermongodb.config;

import com.hcl.flagpicker.flagpickermongodb.document.Continent;
import com.hcl.flagpicker.flagpickermongodb.document.Country;
import com.hcl.flagpicker.flagpickermongodb.repositoty.ContinentRepositoty;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableMongoRepositories(basePackageClasses = ContinentRepositoty.class)
@Configuration
public class MongoDBConfig {
    @Bean
    CommandLineRunner commandLineRunner(ContinentRepositoty continentRepositoty) {
        return string -> {
            continentRepositoty.save(new Continent("0", "Africa", getCountryListAfrica()));
            continentRepositoty.save(new Continent("1", "America", getCountryListAmerica()));
            continentRepositoty.save(new Continent("2", "Asia", getCountryListAsia()));
            continentRepositoty.save(new Continent("3", "Europe", getCountryListEurope()));
            continentRepositoty.save(new Continent("4", "Oceania", getCountryListOceania()));
        };
    }

    private List<Country> getCountryListOceania() {
        List<Country> listCountry = new ArrayList<>();

        listCountry.add(new Country("0", "Australia", "AUFlag"));
        listCountry.add(new Country("1", "Papua New Guinea", "PGFlag"));
        listCountry.add(new Country("2", "New Zealand", "NZFlag"));
        listCountry.add(new Country("3", "Fiji", "FJFlag"));
        listCountry.add(new Country("4", "Solomon Islands", "SIFlag"));

        return listCountry;
    }

    private List<Country> getCountryListEurope() {
        List<Country> listCountry = new ArrayList<>();

        listCountry.add(new Country("0", "Russia", "RUFlag"));
        listCountry.add(new Country("1", "Germany", "GEFlag"));
        listCountry.add(new Country("2", "UK", "UKFlag"));
        listCountry.add(new Country("3", "France", "FRFlag"));
        listCountry.add(new Country("4", "Italy", "ITFlag"));

        return listCountry;
    }

    private List<Country> getCountryListAsia() {
        List<Country> listCountry = new ArrayList<>();

        listCountry.add(new Country("0", "China", "CNFlag"));
        listCountry.add(new Country("1", "India", "INFlag"));
        listCountry.add(new Country("2", "Indonesia", "IDFlag"));
        listCountry.add(new Country("3", "Pakistan", "PKFlag"));
        listCountry.add(new Country("4", "Bangladesh", "BDFlag"));

        return listCountry;
    }

    private List<Country> getCountryListAmerica() {
        List<Country> listCountry = new ArrayList<>();

        listCountry.add(new Country("0", "USA", "USFlag"));
        listCountry.add(new Country("1", "Brazil", "BRFlag"));
        listCountry.add(new Country("2", "Mexico", "MEFlag"));
        listCountry.add(new Country("3", "Colombia", "COFlag"));
        listCountry.add(new Country("4", "Argentina", "AGFlag"));

        return listCountry;
    }

    private List<Country> getCountryListAfrica() {
        List<Country> listCountry = new ArrayList<>();

        listCountry.add(new Country("0", "Nigeria", "NIFlag"));
        listCountry.add(new Country("1", "Ethiopia", "ETFlag"));
        listCountry.add(new Country("2", "Egypt", "EGFlag"));
        listCountry.add(new Country("3", "DR Congo", "DCFlag"));
        listCountry.add(new Country("4", "South Africa", "SAFlag"));

        return listCountry;
    }
}

