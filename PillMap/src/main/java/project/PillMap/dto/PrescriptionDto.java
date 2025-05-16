package project.PillMap.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PrescriptionDto {
    private int id;
    private boolean isValid;
    private Date expireDate;

    public PrescriptionDto() {
    }

    public PrescriptionDto(int id, boolean isValid, Date expireDate) {
        this.id = id;
        this.isValid = isValid;
        this.expireDate = expireDate;
    }

}
