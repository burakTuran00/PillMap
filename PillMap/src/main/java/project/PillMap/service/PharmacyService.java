package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.FindPharmacyRequestDto;
import project.PillMap.dto.PharmacyDto;
import project.PillMap.model.Medication;
import project.PillMap.model.Pharmacy;
import project.PillMap.model.Stock;
import project.PillMap.repository.PharmacyRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PharmacyService {

    private final PharmacyRepository pharmacyRepository;
    private final ModelMapperService modelMapperService;

    public PharmacyService(PharmacyRepository pharmacyRepository, ModelMapperService modelMapperService) {
        this.pharmacyRepository = pharmacyRepository;
        this.modelMapperService = modelMapperService;
    }

    // todo: core
    private String getDataWithLike(String data){
        return ("%" + data + "%");
    }

    public ResponseEntity<List<PharmacyDto>> getAll() {
        List<Pharmacy> pharmacies = pharmacyRepository.findAll();
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()) {
            for (Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<PharmacyDto> getById(int id) {
        Pharmacy pharmacy = pharmacyRepository.getPharmacyById(id);
        PharmacyDto dto = modelMapperService.forResponse().map(pharmacy, PharmacyDto.class);

        return ResponseEntity.ok(dto);
    }

    public ResponseEntity<List<PharmacyDto>> getByNameLike(String name) {
        List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesByNameLike("%"+name+"%");
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getByCityLike(String city) {
        List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesByCityLike("%"+city+"%");
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getByName(String name) {
        List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesByName(name);
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getByCity(String city) {
        List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesByCity(city);
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getBySubCity(String subCity) {
        List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesBySubCity(subCity);
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getBySubCityLike(String subCity) {
        List<Pharmacy> pharmacies = pharmacyRepository.findBySubCityLike("%"+subCity+"%");
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getByCityAndOnDuty(String city, boolean onDuty) {
       List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesByCityAndOnDuty(city, onDuty);
       List<PharmacyDto> results = new ArrayList<>();

       if(!pharmacies.isEmpty()){
           for(Pharmacy pharmacy : pharmacies){
               results.add(modelMapperService.forResponse().map(pharmacy,PharmacyDto.class));
           }
       }

       return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getByAddress(String address) {
        List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesByAddressLike("%"+address+"%");
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy,PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> getByPatientAddress(String city, String subCity, String address) {
        List<Pharmacy> pharmacies = pharmacyRepository.findByCityLikeAndSubCityLikeAndAddressLike(city, subCity, address);
        List<PharmacyDto> results = new ArrayList<>();

        if(!pharmacies.isEmpty()){
            for(Pharmacy pharmacy : pharmacies){
                results.add(modelMapperService.forResponse().map(pharmacy,PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<List<PharmacyDto>> findProperPharmacies(FindPharmacyRequestDto requestDto) {
        List<Pharmacy> pharmacies = pharmacyRepository.findPharmaciesByCity(requestDto.getCity());
        List<Integer> list = requestDto.getMedicationIds();
        List<PharmacyDto> result = new ArrayList<>();

        for (Pharmacy pharmacy : pharmacies) {
            List<Integer> tempList = new ArrayList<>(list);
            List<Stock> tempStock = pharmacy.getStocks();

            for (Stock stock : tempStock) {
                Medication tempMedication = stock.getMedication();

                if (tempList.contains(tempMedication.getId()) && stock.getQuantity() > 0) {
                    tempList.remove(Integer.valueOf(tempMedication.getId()));
                }
            }

            if (tempList.isEmpty()) {
                result.add(modelMapperService.forResponse().map(pharmacy, PharmacyDto.class));
            }
        }

        return ResponseEntity.ok(result);
    }
}
