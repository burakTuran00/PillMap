package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.PillMap.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient findPatientByid(int id);
}
