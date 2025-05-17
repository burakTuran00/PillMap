package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.PharmacyDto;
import project.PillMap.service.PharmacyService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pharmacies")
public class PharmacyController {
    private final PharmacyService pharmacyService;

    public PharmacyController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PharmacyDto>> getAll(){
        return pharmacyService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<PharmacyDto> getById(int id){
        return pharmacyService.getById(id);
    }

    @GetMapping("/getByName")
    public ResponseEntity<List<PharmacyDto>> getByName(String name){
        return pharmacyService.getByName(name);
    }

    @GetMapping("/getByCity")
    public ResponseEntity<List<PharmacyDto>> getByCity(String city){
        return pharmacyService.getByCity(city);
    }

    @GetMapping("/getBySubCity")
    public ResponseEntity<List<PharmacyDto>> getBySubCity(String subCity){
        return pharmacyService.getBySubCity(subCity);
    }

    @GetMapping("/getByNameLike")
    public ResponseEntity<List<PharmacyDto>> getByNameLike(String name){
        return pharmacyService.getByNameLike(name);
    }

    @GetMapping("/getByCityLike")
    public ResponseEntity<List<PharmacyDto>> getByCityLike(String city){
        return pharmacyService.getByCityLike(city);
    }

    @GetMapping("/getBySubCityLike")
    public ResponseEntity<List<PharmacyDto>> getBySubCityLike(String subCity){
        return pharmacyService.getBySubCityLike(subCity);
    }

    @GetMapping("/getByCityAndOnDuty")
    public ResponseEntity<List<PharmacyDto>> getByCityAndOnDuty(String city, boolean onDuty){
        return pharmacyService.getByCityAndOnDuty(city,onDuty);
    }

    @GetMapping("/getByAddress")
    public ResponseEntity<List<PharmacyDto>> gegetByAddress(String address){
        return pharmacyService.getByAddress(address);
    }
}
