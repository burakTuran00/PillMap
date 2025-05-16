package project.PillMap.dto;

import project.PillMap.model.Prescription;

import java.util.Date;
import java.util.List;

public class PatientWithPrescriptionDto {
    private PatientDto patient;
    private List<PrescriptionDto> prescriptions;

    public PatientWithPrescriptionDto() {
    }

    public PatientWithPrescriptionDto(PatientDto patient, List<PrescriptionDto> prescriptions) {
        this.patient = patient;
        this.prescriptions = prescriptions;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public List<PrescriptionDto> getPrescription() {
        return prescriptions;
    }

    public void setPrescription(List<PrescriptionDto> prescriptions) {
        this.prescriptions = prescriptions;
    }
}
