package com.flex.dhp.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by david.airth on 7/13/17.
 */
@Entity
public class Intervention extends AbstractActivity {
    public Intervention(Careplan careplan, InterventionType type, String title) {
        super(careplan, title);
        this.type = type;
    }

    @Column
    @Enumerated(EnumType.STRING)
    private InterventionType type;

    public InterventionType getType() {
        return type;
    }

    @Column
    private int supply;

    public int getSupply() {
        return supply;
    }

    @Column
    private int dosage;

    public int getDosage() {
        return dosage;
    }

    @Column
    private String unit;

    public String getUnit() {
        return unit;
    }

    @Column
    private boolean resultResettable;

    public boolean isResultResettable() {
        return resultResettable;
    }

    Intervention() {
    }// jpa only
}
