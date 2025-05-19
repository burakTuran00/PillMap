package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.MedicationGroupDto;
import project.PillMap.service.MedicationGroupService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/medicationGroups")
public class MedicationGroupController {
    private final MedicationGroupService medicationGroupService;

    public MedicationGroupController(MedicationGroupService medicationGroupService) {
        this.medicationGroupService = medicationGroupService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<MedicationGroupDto>> getAll(){
        return medicationGroupService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<MedicationGroupDto> getById(int id){
        return medicationGroupService.getById(id);
    }

    @GetMapping("/getByName")
    public ResponseEntity<List<MedicationGroupDto>> getByName(String name){
        return medicationGroupService.getByName(name);
    }
}
