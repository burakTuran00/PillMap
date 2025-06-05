package project.PillMap.service;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.PrescriptionDto;
import project.PillMap.exception.NegativeNumberException;
import project.PillMap.model.Prescription;
import project.PillMap.repository.PrescriptionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrescriptionService {
    private final PrescriptionRepository prescriptionRepository;
    private final ModelMapperService modelMapperService;

    public PrescriptionService(PrescriptionRepository prescriptionRepository, ModelMapperService modelMapperService) {
        this.prescriptionRepository = prescriptionRepository;
        this.modelMapperService = modelMapperService;
    }

    public ResponseEntity<List<PrescriptionDto>> getAll() {
        List<Prescription> prescriptions = this.prescriptionRepository.findAll();
        List<PrescriptionDto> results = new ArrayList<>();

        for(Prescription prescription: prescriptions){
            results.add(this.modelMapperService.forResponse().map(prescription, PrescriptionDto.class));
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<PrescriptionDto> getById(int id) {
        if(id <= 0){
            return (ResponseEntity<PrescriptionDto>) ResponseEntity.badRequest();
        }

        Prescription prescription = this.prescriptionRepository.findPrescriptionById(id);
        PrescriptionDto result = this.modelMapperService.forResponse().map(prescription, PrescriptionDto.class);

        return ResponseEntity.ok(result);
    }

    public ResponseEntity<List<PrescriptionDto>> getPrescriptionByPatientId(int id) {
        List<Prescription> prescriptions = this.prescriptionRepository.findPrescriptionsByPatientId(id);

        if(prescriptions.isEmpty()){
            return (ResponseEntity<List<PrescriptionDto>>) ResponseEntity.notFound();
        }

        List<PrescriptionDto> results = new ArrayList<>();

        for(Prescription prescription: prescriptions){
            results.add(this.modelMapperService.forResponse().map(prescription, PrescriptionDto.class));
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<PrescriptionDto> getASpecificPrescriptionOfPatient(int patientId, int prescriptionId){
        Prescription prescription = prescriptionRepository.findByPatientIdAndId(patientId, prescriptionId);
        return ResponseEntity.ok(modelMapperService.forResponse().map(prescription,PrescriptionDto.class));
    }
}
