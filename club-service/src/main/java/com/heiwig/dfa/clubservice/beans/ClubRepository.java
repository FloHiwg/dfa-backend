package com.heiwig.dfa.clubservice.beans;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends
        JpaRepository<Club, Long> {
    Club findById(int id);
}
