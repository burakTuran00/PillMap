package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.dto.FindPharmacyRequestDto;
import project.PillMap.dto.PharmacyDto;

import java.util.List;

@Service
public class EPharmacyService {
    private final PharmacyService pharmacyService;

    public EPharmacyService(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    public ResponseEntity<List<PharmacyDto>> findPharmacy(FindPharmacyRequestDto requestDto) {
        return pharmacyService.findProperPharmacies(requestDto);
    }
}
