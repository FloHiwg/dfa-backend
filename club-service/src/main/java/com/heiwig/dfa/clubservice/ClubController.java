package com.heiwig.dfa.clubservice;

import com.heiwig.dfa.clubservice.beans.Club;
import com.heiwig.dfa.clubservice.beans.ClubRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ClubController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //Can be used to return port for testing and logging purposes
    @Autowired
    private Environment environment;

    @Autowired
    private ClubRepository repository;

    @GetMapping("/club/id/{id}")
    public Club retrieveClubById(@PathVariable long id) {
        logger.info("Get boat with id: {}", id);

        Optional<Club> club = repository.findById(id);

        logger.info("Retrieve club by id: {}", club);

        if(club.isPresent()) {
            return club.get();
        } else {
            //TODO: responed with error that id couldn't be found
        }
        return null;
    }
}
