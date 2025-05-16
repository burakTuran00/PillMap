package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.PrescriptionDto;
import project.PillMap.service.PrescriptionService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prescriptions")
public class PrescriptionController {
    private final PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PrescriptionDto>> getAll(){
        return this.prescriptionService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<PrescriptionDto> getById(int id){
        return this.prescriptionService.getById(id);
    }

    @GetMapping("/getPrescriptionsByPatientId")
    public ResponseEntity<List<PrescriptionDto>> getPrescriptionByPatientId(int id) {
        return this.prescriptionService.getPrescriptionByPatientId(id);
    }
}
