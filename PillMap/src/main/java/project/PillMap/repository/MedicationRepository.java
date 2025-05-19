package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.PillMap.model.Medication;

import java.util.List;

public interface MedicationRepository extends JpaRepository<Medication, Integer> {
    Medication findMedicationById(int id);
    List<Medication> findMedicationsByNameLike(String name);

    @Query(value = "SELECT * FROM medications WHERE group_id = :id", nativeQuery = true)
    List<Medication> findMedicationsByGroupId(@Param("id") int id);
}
