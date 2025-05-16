package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.PatientDto;
import project.PillMap.dto.PatientWithPrescriptionDto;
import project.PillMap.dto.PrescriptionDto;
import project.PillMap.model.Patient;
import project.PillMap.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final ModelMapperService modelMapperService;
    private final PrescriptionService prescriptionService;

    public PatientService(PatientRepository patientRepository, ModelMapperService modelMapperService, PrescriptionService prescriptionService) {
        this.patientRepository = patientRepository;
        this.modelMapperService = modelMapperService;
        this.prescriptionService = prescriptionService;
    }

    public ResponseEntity<List<PatientDto>> getAll() {
        List<Patient> patients = this.patientRepository.findAll();
        List<PatientDto> result = new ArrayList<>();

        for (Patient patient : patients) {
            result.add(this.modelMapperService.forResponse().map(patient, PatientDto.class));
        }

        return ResponseEntity.ok(result);
    }

    public ResponseEntity<PatientDto> getPatientById(int id) {
        Patient patient = this.patientRepository.findPatientByid(id);
        return ResponseEntity.ok(this.modelMapperService.forResponse().map(patient, PatientDto.class));
    }


    public ResponseEntity<PatientWithPrescriptionDto> getPatientWithPrescriptionsById(int id) {
        PatientDto patient = this.modelMapperService.forResponse()
                .map(this.patientRepository.findPatientByid(id), PatientDto.class);
        List<PrescriptionDto> prescriptions = this.prescriptionService.getPrescriptionByPatientId(id).getBody();

        PatientWithPrescriptionDto result = new PatientWithPrescriptionDto(patient, prescriptions);
        return ResponseEntity.ok(result);
    }
}
