package project.PillMap.dto;

public class PrescriptionDetailWithMedicationDto {
    private MedicationDto medicationDto;

    public PrescriptionDetailWithMedicationDto() {
    }

    public PrescriptionDetailWithMedicationDto( MedicationDto medicationDto) {
        this.medicationDto = medicationDto;
    }

    public MedicationDto getMedicationDto() {
        return medicationDto;
    }

    public void setMedicationDto(MedicationDto medicationDto) {
        this.medicationDto = medicationDto;
    }
}
