package com.flex.dhp.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by david.airth on 7/9/17.
 */
@Entity
public class Careplan extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @JsonIgnore
    @ManyToOne
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    @OneToMany(mappedBy = "careplan")
    @JsonManagedReference
    private Set<Assessment> assessments = new HashSet<>();

    public Set<Assessment> getAssessments() {
        return assessments;
    }

    @OneToMany(mappedBy = "careplan")
    //@JsonManagedReference
    private Set<Intervention> interventions = new HashSet<>();

    public Set<Intervention> getInterventions() {
        return interventions;
    }

    public Careplan(Patient patient, String name) {
        this.patient = patient;
        this.name = name;
    }

    public Careplan() {
    }// jpa only
}


