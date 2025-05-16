package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.PillMap.model.Prescription;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    Prescription findPrescriptionById(int Id);
    List<Prescription> findPrescriptionsByPatientId(int patient_id);
}
