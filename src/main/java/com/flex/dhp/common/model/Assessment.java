package com.flex.dhp.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by david.airth on 7/13/17.
 */
@Entity
public class Assessment extends AbstractActivity {

    public Assessment(Careplan careplan, String title) {
        super(careplan, title);
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private AssessmentType type;

    public AssessmentType getType() {
        return type;
    }

    Assessment() {
    }// jpa only
}
