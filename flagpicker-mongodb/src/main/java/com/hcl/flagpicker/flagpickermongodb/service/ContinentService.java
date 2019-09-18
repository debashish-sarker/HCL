package com.hcl.flagpicker.flagpickermongodb.service;

import com.hcl.flagpicker.flagpickermongodb.document.Continent;
import com.hcl.flagpicker.flagpickermongodb.document.Country;
import com.hcl.flagpicker.flagpickermongodb.repositoty.ContinentRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {
    @Autowired
    private ContinentRepositoty continentRepositoty;

    //Retrive
    public List<Continent> getAll() {
        return continentRepositoty.findAll();
    }

    public Continent getContinentsById(String id) {
        return continentRepositoty.findById(id).get();
    }

    public Continent getContinentByName(String continent) {
        return continentRepositoty.findByContinent(continent);
    }

    public String getCountryFlagByContinentAndCountryName(String continent, String countryName) {
        Continent curContinent = continentRepositoty.findByContinent(continent);
        if (curContinent == null) {
            return null;
        }

        for (Country country : curContinent.getCountries()) {
            if (country.getCountryName().equals(countryName)) {
                return country.getCountryFlag();
            }
        }
        return null;
    }

    public void deleteAll() {
        continentRepositoty.deleteAll();
    }

//    //Create Operation
//    public Continent create(Continent newContinent) {
//        return continentRepositoty.save(newContinent);
//    }
//
//    public void deleteByID(String id) {
//        //Continent continentToDelete = continentRepositoty.findById(id).get();
//        continentRepositoty.deleteById(id);
//    }
//
//    public void updateContinentByID(String id, Continent updatedContinent) {
//        Continent continentToBeUpdated = continentRepositoty.findById(id).get();
//        continentToBeUpdated.setContinent(updatedContinent.getContinent());
//        continentToBeUpdated.setCountries(updatedContinent.getCountries());
//        continentRepositoty.save(continentToBeUpdated);
//    }
}
