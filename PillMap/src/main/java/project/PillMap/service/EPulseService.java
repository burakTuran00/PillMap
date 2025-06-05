package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.dto.PrescriptionDetailDto;
import project.PillMap.dto.PrescriptionDetailWithMedicationDto;
import project.PillMap.dto.PrescriptionDto;
import project.PillMap.dto.PrescriptionWithDetailDto;

import java.util.List;

@Service
public class EPulseService {
    private final PrescriptionService prescriptionService;
    private final PrescriptionDetailService prescriptionDetailService;
    private final MedicationService medicationService;

    public EPulseService(PrescriptionService prescriptionService, PrescriptionDetailService prescriptionDetailService, MedicationService medicationService) {
        this.prescriptionService = prescriptionService;
        this.prescriptionDetailService = prescriptionDetailService;
        this.medicationService = medicationService;
    }

    /// To get all prescriptions of the patient.
    public ResponseEntity<List<PrescriptionDto>> getMyPrescriptions(int id) {
         return prescriptionService.getPrescriptionByPatientId(id);
    }

    /// To get a specific prescription of the patient.
    public ResponseEntity<PrescriptionDto> getMyPrescription(int patientId, int prescriptionId) {
        return prescriptionService.getASpecificPrescriptionOfPatient(patientId, prescriptionId);
    }

    /// To get details of the prescription
    public ResponseEntity<List<PrescriptionDetailDto>> geDetailOfPrescription(int prescriptionId) {
        return prescriptionDetailService.getByPrescriptionId(prescriptionId);
    }

    /// to get medications of the prescription.
    public ResponseEntity<PrescriptionWithDetailDto> getMedicationsOfPrescription(int patientId, int prescriptionId) {
        PrescriptionDto prescriptionDto = prescriptionService.
                getASpecificPrescriptionOfPatient(patientId, prescriptionId).getBody();

        List<PrescriptionDetailWithMedicationDto> details = prescriptionDetailService.
                getPrescriptionWithDetail(prescriptionId).getBody();

        PrescriptionWithDetailDto result = new PrescriptionWithDetailDto(prescriptionDto, details);
        return ResponseEntity.ok(result);
    }
}
