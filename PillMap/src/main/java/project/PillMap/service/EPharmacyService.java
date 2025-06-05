package project.PillMap.service;

import org.springframework.stereotype.Service;

@Service
public class EPharmacyService {
    private final PharmacyService pharmacyService;

    public EPharmacyService(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }


}
