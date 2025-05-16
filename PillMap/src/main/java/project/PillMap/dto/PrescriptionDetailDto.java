package project.PillMap.dto;

public class PrescriptionDetailDto {
    private int id;
    private int prescriptionId;
    private int medicationId;

    //region Constructor

    public PrescriptionDetailDto() {
    }

    public PrescriptionDetailDto(int id, int prescriptionId, int medicationId) {
        this.id = id;
        this.prescriptionId = prescriptionId;
        this.medicationId = medicationId;
    }

    //endregion Constructor

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    //endregion Getters and Setters
}
