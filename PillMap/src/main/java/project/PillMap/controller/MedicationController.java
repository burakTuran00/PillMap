package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.MedicationDto;
import project.PillMap.service.MedicationService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/medications")
public class MedicationController {
    private final MedicationService medicationService;

    public MedicationController(MedicationService medicationService) {
        this.medicationService = medicationService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<MedicationDto>> getAll(){
        return medicationService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<MedicationDto> getById(int id){
        return medicationService.getById(id);
    }

    @GetMapping("/getByName")
    public ResponseEntity<List<MedicationDto>> getByName(String name){
        return medicationService.getByName(name);
    }

    @GetMapping("/getByGroupId")
    public ResponseEntity<List<MedicationDto>> getByGroupId(int id){
        return medicationService.getByGroupId(id);
    }
}
