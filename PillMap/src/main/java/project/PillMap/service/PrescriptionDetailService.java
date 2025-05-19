package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.PrescriptionDetailDto;
import project.PillMap.model.PrescriptionDetail;
import project.PillMap.repository.PrescriptionDetailRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrescriptionDetailService {
    private final PrescriptionDetailRepository prescriptionDetailRepository;
    private final ModelMapperService modelMapperService;

    public PrescriptionDetailService(PrescriptionDetailRepository prescriptionDetailRepository, ModelMapperService modelMapperService) {
        this.prescriptionDetailRepository = prescriptionDetailRepository;
        this.modelMapperService = modelMapperService;
    }

    public ResponseEntity<List<PrescriptionDetailDto>> getAll() {
        List<PrescriptionDetail> prescriptionDetails = prescriptionDetailRepository.findAll();
        List<PrescriptionDetailDto> results = new ArrayList<>();

        if(!prescriptionDetails.isEmpty()){
            for(PrescriptionDetail detail : prescriptionDetails){
                results.add(modelMapperService.forResponse().map(detail,PrescriptionDetailDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }

    public ResponseEntity<PrescriptionDetailDto> getById(int id) {
        PrescriptionDetail prescriptionDetail = prescriptionDetailRepository.findPrescriptionDetailById(id);
        return ResponseEntity.ok(modelMapperService.forResponse().map(prescriptionDetail, PrescriptionDetailDto.class));
    }

    public ResponseEntity<List<PrescriptionDetailDto>> getByPrescriptionId(int id) {
        List<PrescriptionDetail> prescriptionDetails = prescriptionDetailRepository.findAllByPrescriptionId(id);
        List<PrescriptionDetailDto> results = new ArrayList<>();

        if(!prescriptionDetails.isEmpty()){
            for(PrescriptionDetail detail : prescriptionDetails){
                results.add(modelMapperService.forResponse().map(detail,PrescriptionDetailDto.class));
            }
        }

        return ResponseEntity.ok(results);
    }
}
