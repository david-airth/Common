package com.flex.dhp.common.repository;

import com.flex.dhp.common.model.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

/**
 * Created by david.airth on 7/10/17.
 */
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
    Collection<Assessment> findByCareplanId(long careplanId);

    @Query("SELECT a FROM Assessment a JOIN a.careplan c WHERE c.patient.id = ?1")
    Collection<Assessment> findByPatientId(long patientId);

    void deleteAllByCareplan_Id(long careplanId);


}
