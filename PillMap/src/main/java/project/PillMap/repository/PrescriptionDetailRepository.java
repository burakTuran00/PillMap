package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.PillMap.model.PrescriptionDetail;

import java.util.List;

public interface PrescriptionDetailRepository extends JpaRepository<PrescriptionDetail, Integer> {
    PrescriptionDetail findPrescriptionDetailById(int id);
    List<PrescriptionDetail> findAllByPrescriptionId(int id);
}
