package com.flex.dhp.common.repository;

import com.flex.dhp.common.model.Careplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by david.airth on 7/10/17.
 */
public interface CareplanRepository extends JpaRepository<Careplan, Long> {
    Collection<Careplan> findByPatientId(long patientId);
}
