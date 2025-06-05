package project.PillMap.dto;

import java.util.ArrayList;
import java.util.List;

public class FindPharmacyRequestDto {
    private String city;
    private List<Integer> medicationIds;

    public FindPharmacyRequestDto() {
    }

    public FindPharmacyRequestDto(String city, List<Integer> medicationIds) {
        this.city = city;
        this.medicationIds = medicationIds;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Integer> getMedicationIds() {
        return medicationIds;
    }

    public void setMedicationIds(List<Integer> medicationIds) {
        this.medicationIds = medicationIds;
    }
}
