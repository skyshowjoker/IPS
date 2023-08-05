package com.example.ads.repository;


import com.example.ads.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {
    List<Patient> findByLastName(String name);

    Patient findById(long id);
}
