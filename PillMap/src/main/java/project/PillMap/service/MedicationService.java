package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.MedicationDto;
import project.PillMap.model.Medication;
import project.PillMap.repository.MedicationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicationService {
    private final MedicationRepository medicationRepository;
    private final ModelMapperService modelMapperService;

    public MedicationService(MedicationRepository medicationRepository, ModelMapperService modelMapperService) {
        this.medicationRepository = medicationRepository;
        this.modelMapperService = modelMapperService;
    }

    public ResponseEntity<List<MedicationDto>> getAll() {
        List<Medication> medications = medicationRepository.findAll();
        List<MedicationDto> results = new ArrayList<>();

        if(!medications.isEmpty()){
            for (Medication medication : medications){
                results.add(modelMapperService.forResponse().map(medication, MedicationDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<MedicationDto> getById(int id) {
        Medication medication = medicationRepository.findMedicationById(id);
        return ResponseEntity.ok(modelMapperService.forResponse().map(medication, MedicationDto.class));
    }

    public ResponseEntity<List<MedicationDto>> getByName(String name) {
        List<Medication> medications = medicationRepository.findMedicationsByNameLike("%"+ name +"%");
        List<MedicationDto> results = new ArrayList<>();

        if(!medications.isEmpty()){
            for (Medication medication : medications){
                results.add(modelMapperService.forResponse().map(medication, MedicationDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<MedicationDto>> getByGroupId(int id) {
        List<Medication> medications = medicationRepository.findMedicationsByGroupId(id);
        List<MedicationDto> results = new ArrayList<>();

        if(!medications.isEmpty()){
            for(Medication medication: medications){
                results.add(modelMapperService.forResponse().map(medication,MedicationDto.class));
            }
        }
        return ResponseEntity.ok(results);
    }
}
