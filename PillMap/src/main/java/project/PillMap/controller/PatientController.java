package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.PatientDto;
import project.PillMap.dto.PatientWithPrescriptionDto;
import project.PillMap.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PatientDto>> getAll(){
        return this.patientService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<PatientDto> getPatientById(int id){
        return this.patientService.getPatientById(id);
    }

    @GetMapping("/getPatientWithPrescriptionsById")
    public ResponseEntity<PatientWithPrescriptionDto> getPatientWithPrescriptionsById(int id) {
        return this.patientService.getPatientWithPrescriptionsById(id);
    }
}
