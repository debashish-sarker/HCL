package com.hcl.flagpicker.flagpickermongodb.resource;

import com.hcl.flagpicker.flagpickermongodb.document.Continent;
import com.hcl.flagpicker.flagpickermongodb.document.Country;
import com.hcl.flagpicker.flagpickermongodb.repositoty.ContinentRepositoty;
import com.hcl.flagpicker.flagpickermongodb.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/continents")
public class ContinentResource {

    @Autowired
    private ContinentService continentService;

    @GetMapping("/")
    public List<Continent> getAll() {
        return continentService.getAll();
    }

    @GetMapping("/{id}")
    public Continent getContinentsById(@PathVariable String id) {
        return continentService.getContinentsById(id);
    }

    @GetMapping("/name/{continent}")
    public Continent getContinents(@PathVariable String continent) {
        return continentService.getContinentByName(continent);
    }

    @GetMapping("/name/{continent}/country/{countryName}")
    public String getCountryByContinentAndCountryName(@PathVariable String continent, @PathVariable String countryName) {
       return continentService.getCountryFlagByContinentAndCountryName(continent, countryName);
    }

    @DeleteMapping("/removeall")
    public void deleteAll() {
        continentService.deleteAll();
    }

//    @DeleteMapping("/remove/{id}")
//    public void deleteByID(String id) {
//        continentService.deleteByID(id);
//    }
//
//    @PostMapping("/create")
//    public void createContinent(Continent newContinent) {
//        continentService.create(newContinent);
//    }
//
//    @PutMapping("/update/{id}")
//    public void updateContinentByID(String id, Continent updatedContinent) {
//        continentService.updateContinentByID(id, updatedContinent);
//    }

}
