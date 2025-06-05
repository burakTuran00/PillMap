package project.PillMap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.PharmacyDto;
import project.PillMap.model.Pharmacy;
import project.PillMap.service.EPharmacyService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ePharmacyProvider")
public class EPharmacyController {
    private final EPharmacyService ePharmacyService;

    public EPharmacyController(EPharmacyService ePharmacyService) {
        this.ePharmacyService = ePharmacyService;
    }

    @GetMapping("/findPharmacies")
    public List<PharmacyDto> findPharmacies(List<Integer> medicationIds){
        return null ;
    }
}
