package project.PillMap.dto;

import project.PillMap.model.Medication;

public class StockDto {
    private int id;
    private int quantity;
    private int medicationId;
    private int pharmacyId;

    //region Constructor
    public StockDto() {
    }

    public StockDto(int id, int quantity, int medicationId, int pharmacyId) {
        this.id = id;
        this.quantity = quantity;
        this.medicationId = medicationId;
        this.pharmacyId = pharmacyId;
    }
//endregion Constructor

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    //endregion Getters and Setters
}
