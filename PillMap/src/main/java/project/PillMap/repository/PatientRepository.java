package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.PillMap.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
