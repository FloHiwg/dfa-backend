package com.heiwig.dfa.boatservice;

import com.heiwig.dfa.boatservice.beans.Boat;
import com.heiwig.dfa.boatservice.beans.BoatRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BoatController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //Can be used to return port for testing and logging purposes
    @Autowired
    private Environment environment;

    @Autowired
    private BoatRepository repository;

    @GetMapping("/boat/id/{id}")
    public Boat retrieveBoatById(@PathVariable long id) {
        logger.info("Get boat with id: {}", id);

        Optional<Boat> boat = repository.findById(id);

        logger.info("Retrieve boat: {}", boat);

        if(boat.isPresent()) {
            return boat.get();
        } else {
            //TODO: responed with error that id couldn't be found
        }
        return null;
    }

}
