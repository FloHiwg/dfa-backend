package com.heiwig.dfa.clubservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Club {

    @Id
    private Long id;

    @Column(name="club_name")
    private String name;

}
