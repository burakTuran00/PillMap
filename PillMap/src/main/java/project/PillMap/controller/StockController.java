package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.StockDto;
import project.PillMap.service.StockService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<StockDto>> getAll(){
        return stockService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<List<StockDto>> getById(int id){
        return stockService.getById(id);
    }

    @GetMapping("/getByPharmacyId")
    public ResponseEntity<List<StockDto>> getByPharmacyId(int id){
        return stockService.getByPharmacyId(id);
    }

    @GetMapping("/getByMedicationId")
    public ResponseEntity<List<StockDto>> getByMedicationId(int id){
        return stockService.getByMedicationId(id);
    }
}
