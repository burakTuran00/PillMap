package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.converter.PatientConverter;
import project.PillMap.dto.PatientDto;
import project.PillMap.entity.Patient;
import project.PillMap.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PatientService {
    private final PatientRepository patientRepository;
    private final PatientConverter converter;
    private final ModelMapperService modelMapperService;

    public PatientService(PatientRepository patientRepository, PatientConverter converter, ModelMapperService modelMapperService) {
        this.patientRepository = patientRepository;
        this.converter = converter;
        this.modelMapperService = modelMapperService;
    }

    public void add(PatientDto patientDto){
        Patient p = this.modelMapperService.forRequest().map(patientDto, Patient.class);
        this.patientRepository.save(p);
    }

    public ResponseEntity<List<PatientDto>> getAll() {
        List<Patient> patients = this.patientRepository.findAll();
        List<PatientDto> results = new ArrayList<>();

        for(Patient p : patients) {
            results.add(converter.toDto(p));
        }
        return  ResponseEntity.ok(results);
    }

    public ResponseEntity<PatientDto> getPatientById(int id) {
        Optional<Patient> p =  this.patientRepository.findById(id);
        return ResponseEntity.ok(converter.toDto(p.orElseThrow()));
    }

    public void delete(int id) {
        this.patientRepository.deleteById(id);
    }

    public ResponseEntity<String> getNameById(int id) {
        Optional<Patient> p = this.patientRepository.findById(id);
        return ResponseEntity.ok(p.get().getName());
    }
}
