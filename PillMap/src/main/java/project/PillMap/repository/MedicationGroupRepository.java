package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.PillMap.model.MedicationGroup;

import java.util.List;

public interface MedicationGroupRepository extends JpaRepository<MedicationGroup, Integer> {
    List<MedicationGroup> findByNameLike(String name);
    MedicationGroup findMedicationGroupById(int id);
}
