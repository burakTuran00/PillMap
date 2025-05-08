package project.PillMap.dto;

import jakarta.persistence.*;
import project.PillMap.entity.Medication;
import project.PillMap.entity.Prescription;

public class PrescriptionDetailDto {
    private int id;
    private Medication medication;
}
