package project.PillMap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.PillMap.dto.MedicationDto;
import project.PillMap.dto.PrescriptionDetailDto;
import project.PillMap.dto.PrescriptionDto;
import project.PillMap.dto.PrescriptionWithDetailDto;
import project.PillMap.service.EPulseService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ePulseProvider")
public class EPulseController {
    private final EPulseService ePulseService;

    public EPulseController(EPulseService ePulseService) {
        this.ePulseService = ePulseService;
    }

    /// To get all prescriptions of the patient.
    @GetMapping("/getMyPrescriptions")
    public ResponseEntity<List<PrescriptionDto>> getMyPrescriptions(int patientId){
        return ePulseService.getMyPrescriptions(patientId);
    }

    /// To get a specific prescription of the patient.
    @GetMapping("/getMyPrescription")
    public ResponseEntity<PrescriptionDto> getMyPrescription(int patientId, int prescriptionId){
        return ePulseService.getMyPrescription(patientId, prescriptionId);
    }

    /// To get details of the prescription.
    @GetMapping("/getDetailOfPrescription")
    public ResponseEntity<List<PrescriptionDetailDto>> geDetailOfPrescription(int prescriptionId){
        return ePulseService.geDetailOfPrescription(prescriptionId);
    }

    /// to get medications of the prescription.
    @GetMapping("/getMedicationsOfPrescription")
    public ResponseEntity<PrescriptionWithDetailDto> getMedicationsOfPrescription(int patientId, int prescriptionId){
        return ePulseService.getMedicationsOfPrescription(patientId, prescriptionId);
    }
}
