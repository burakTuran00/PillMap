package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.PillMap.model.Stock;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Integer> {
    List<Stock> findStocksByPharmacyId(int id);
    List<Stock> findStocksByMedicationId(int id);
}
