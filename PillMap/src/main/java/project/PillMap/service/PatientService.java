package project.PillMap.service;

import com.fasterxml.jackson.core.PrettyPrinter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.PatientDto;
import project.PillMap.entity.Patient;
import project.PillMap.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final ModelMapperService modelMapperService;

    public PatientService(PatientRepository patientRepository, ModelMapperService modelMapperService) {
        this.patientRepository = patientRepository;
        this.modelMapperService = modelMapperService;
    }

    public ResponseEntity<List<PatientDto>> getAll() {
        List<Patient> patients = this.patientRepository.findAll();
        List<PatientDto> result = new ArrayList<>();

        for (Patient patient : patients) {
            result.add(this.modelMapperService.forResponse().map(patient, PatientDto.class));
        }

        return ResponseEntity.ok(result);
    }
}
