package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.PrescriptionDetailDto;
import project.PillMap.service.PrescriptionDetailService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prescriptionDetails")
public class PrescriptionDetailController {
    private final PrescriptionDetailService prescriptionDetailService;

    public PrescriptionDetailController(PrescriptionDetailService prescriptionDetailService) {
        this.prescriptionDetailService = prescriptionDetailService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PrescriptionDetailDto>> getAll(){
        return prescriptionDetailService.getAll();
    }

    @GetMapping("/getById")
    public ResponseEntity<PrescriptionDetailDto> getById(int id){
        return prescriptionDetailService.getById(id);
    }

    @GetMapping("/getByPrescriptionId")
    public ResponseEntity<List<PrescriptionDetailDto>> getByPrescriptionId(int id){
        return prescriptionDetailService.getByPrescriptionId(id);
    }
}
