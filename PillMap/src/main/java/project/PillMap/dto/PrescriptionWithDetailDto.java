package project.PillMap.dto;

import java.util.List;

public class PrescriptionWithDetailDto {
    private PrescriptionDto prescriptionDto;
    private List<PrescriptionDetailWithMedicationDto> prescriptionDetailWithMedicationDto;

    public PrescriptionWithDetailDto() {
    }

    public PrescriptionWithDetailDto(PrescriptionDto prescriptionDto, List<PrescriptionDetailWithMedicationDto> prescriptionDetailWithMedicationDto) {
        this.prescriptionDto = prescriptionDto;
        this.prescriptionDetailWithMedicationDto = prescriptionDetailWithMedicationDto;
    }

    public PrescriptionDto getPrescriptionDto() {
        return prescriptionDto;
    }

    public void setPrescriptionDto(PrescriptionDto prescriptionDto) {
        this.prescriptionDto = prescriptionDto;
    }

    public List<PrescriptionDetailWithMedicationDto> getPrescriptionDetailWithMedicationDto() {
        return prescriptionDetailWithMedicationDto;
    }

    public void setPrescriptionDetailWithMedicationDto(List<PrescriptionDetailWithMedicationDto> prescriptionDetailWithMedicationDto) {
        this.prescriptionDetailWithMedicationDto = prescriptionDetailWithMedicationDto;
    }
}
