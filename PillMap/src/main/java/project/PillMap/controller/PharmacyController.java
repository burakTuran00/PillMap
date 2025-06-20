package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.PillMap.dto.FindPharmacyRequestDto;
import project.PillMap.dto.PharmacyDto;
import project.PillMap.service.PharmacyService;

import java.util.ArrayList;
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
    public ResponseEntity<List<PharmacyDto>> getByAddress(String address){
        return pharmacyService.getByAddress(address);
    }

    @GetMapping("/getByPatientAddress")
    public ResponseEntity<List<PharmacyDto>> getByPatientAddress(String city, String subCity, String address){
        return pharmacyService.getByPatientAddress(city, subCity, address);
    }

    @PostMapping("/findProperPharmacies")
    public ResponseEntity<List<PharmacyDto>> findProperPharmacies(@RequestBody FindPharmacyRequestDto requestDto){
        return pharmacyService.findProperPharmacies(requestDto);
    }
}
