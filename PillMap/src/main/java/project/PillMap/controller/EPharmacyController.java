package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.PillMap.dto.FindPharmacyRequestDto;
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

    @PostMapping("/findPharmacy")
    public ResponseEntity<List<PharmacyDto>> findPharmacy(@RequestBody FindPharmacyRequestDto requestDto){
        return ePharmacyService.findPharmacy(requestDto);
    }
}
