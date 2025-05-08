package project.PillMap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.PillMap.dto.PatientDto;
import project.PillMap.service.PatientService;

import java.util.List;

@RequestMapping("/api/v1/patients")
@RestController
public class PatientController {
    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody PatientDto patientDto) {
        this.patientService.add(patientDto);
    }

    @DeleteMapping("/delete")
    public void delete(int id) {
        this.patientService.delete(id);
    }

    @GetMapping("/getNameById")
    public ResponseEntity<String> getNameById(int id){
        return this.patientService.getNameById(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PatientDto>> getPatients(){
        return this.patientService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<PatientDto> getPatientById(int id) {
        return this.patientService.getPatientById(id);
    }
}
