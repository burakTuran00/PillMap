package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.MedicationGroupDto;
import project.PillMap.model.MedicationGroup;
import project.PillMap.repository.MedicationGroupRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicationGroupService {
    private final MedicationGroupRepository medicationGroupRepository;
    private final ModelMapperService modelMapperService;

    public MedicationGroupService(MedicationGroupRepository medicationGroupRepository, ModelMapperService modelMapperService) {
        this.medicationGroupRepository = medicationGroupRepository;
        this.modelMapperService = modelMapperService;
    }

    public ResponseEntity<List<MedicationGroupDto>> getAll() {
        List<MedicationGroup> groups = medicationGroupRepository.findAll();
        List<MedicationGroupDto> dtos = new ArrayList<>();

        if(!groups.isEmpty()){
            for(MedicationGroup group : groups){
                dtos.add(modelMapperService.forResponse().map(group, MedicationGroupDto.class));
            }
        }

        return ResponseEntity.ok(dtos);
    }

    public ResponseEntity<MedicationGroupDto> getById(int id) {
        MedicationGroup group = medicationGroupRepository.findMedicationGroupById(id);
        return ResponseEntity.ok(modelMapperService.forResponse().map(group, MedicationGroupDto.class));
    }

    public ResponseEntity<List<MedicationGroupDto>> getByName(String name) {
        List<MedicationGroup> groups = medicationGroupRepository.findByNameLike("%"+name+"%");
        List<MedicationGroupDto> dtos = new ArrayList<>();

        if(!groups.isEmpty()){
            for(MedicationGroup group : groups){
                dtos.add(modelMapperService.forResponse().map(group, MedicationGroupDto.class));
            }
        }

        return ResponseEntity.ok(dtos);
    }
}
