package com.flex.dhp.common.model;

/**
 * Created by david.airth on 7/13/17.
 */

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    @Column(name = "updated_on")
    @UpdateTimestamp
    private Date updatedOn;

    public Date getUpdatedOn() {
        return updatedOn;
    }

    @Column(name = "created_on")
    @CreationTimestamp
    private Date createdOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    @Column(name = "updated_by")
    @LastModifiedBy
    private String updatedBy;

    public String getUpdatedBy() {
        return updatedBy;
    }

    protected AbstractEntity() {
    } //JPA only
}
