package project.PillMap.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import project.PillMap.entity.Patient;
import project.PillMap.entity.PrescriptionDetail;

import java.util.Date;
import java.util.List;

public class PrescriptionDto {
    private int id;
    private boolean isValid;
    private Date expireDate;
    private List<PrescriptionDetailDto> prescriptionDetails;

    public PrescriptionDto() {
    }

    public PrescriptionDto(int id, boolean isValid, Date expireDate, List<PrescriptionDetailDto> prescriptionDetails) {
        this.id = id;
        this.isValid = isValid;
        this.expireDate = expireDate;
        this.prescriptionDetails = prescriptionDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public List<PrescriptionDetailDto> getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(List<PrescriptionDetailDto> prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }
}
