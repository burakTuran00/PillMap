package project.PillMap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "prescription_details")
public class PrescriptionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "prescription_id", referencedColumnName = "id")
    private Prescription prescription;

    @OneToOne
    @JoinColumn(name = "medication_id", referencedColumnName = "id")
    private Medication medication;

    //region Constructors
    public PrescriptionDetail() {
    }

    public PrescriptionDetail(int id, Prescription prescription, Medication medication) {
        this.id = id;
        this.prescription = prescription;
        this.medication = medication;
    }
    //endregion Constructors

    //region Getters And Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    //endregion Getters And Setters
}
