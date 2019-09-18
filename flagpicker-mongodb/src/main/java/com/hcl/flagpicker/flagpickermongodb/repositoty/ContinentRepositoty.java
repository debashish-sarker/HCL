package com.hcl.flagpicker.flagpickermongodb.repositoty;

import com.hcl.flagpicker.flagpickermongodb.document.Continent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepositoty extends MongoRepository<Continent, String> {
    public Continent findByContinent(String continent);
}
