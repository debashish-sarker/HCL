package com.hcl.flagpicker.flagpickermongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document
public class Continent {
    @Id
    private String id;
    private String continent;
    private List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public Continent(String id, String continent, List<Country> countries) {
        this.id = id;
        this.continent = continent;
        this.countries = countries;
    }

    public String getId() {
        return id;
    }

    public String getContinent() {
        return continent;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

}
