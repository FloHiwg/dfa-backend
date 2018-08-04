package com.heiwig.dfa.boatservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Boat {

    @Id
    private Long id;

    @Column(name="boat_name")
    private String name;

    private String boatType;
    private String boatSlot;
    private String boatRigger;
    private String boatCox;
    private Long clubId;

    public Boat() {
    }

    public Boat(Long id, String name, String boatType, String baotSlot, String boatRigger, String boatCox) {
        this.id = id;
        this.name = name;
        this.boatType = boatType;
        this.boatSlot = baotSlot;
        this.boatRigger = boatRigger;
        this.boatCox = boatCox;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoatType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public String getBoatSlot() {
        return boatSlot;
    }

    public void setBoatSlot(String boatSlot) {
        this.boatSlot = boatSlot;
    }

    public String getBoatRigger() {
        return boatRigger;
    }

    public void setBoatRigger(String boatRigger) {
        this.boatRigger = boatRigger;
    }

    public String getBoatCox() {
        return boatCox;
    }

    public void setBoatCox(String boatCox) {
        this.boatCox = boatCox;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }
}
