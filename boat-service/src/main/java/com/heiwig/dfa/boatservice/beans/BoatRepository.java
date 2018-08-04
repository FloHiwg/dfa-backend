package com.heiwig.dfa.boatservice.beans;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoatRepository extends
        JpaRepository<Boat, Long> {
    Boat findById(int id);
}
