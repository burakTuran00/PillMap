package project.PillMap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;

    @Column(name = "isValid")
    private boolean isValid;

    @Column(name = "expire_date")
    private Date expireDate;

    @OneToMany(mappedBy = "prescription")
    @JsonManagedReference
    private List<PrescriptionDetail> prescriptionDetails;

    //region Constructors
    public Prescription() {
    }

    public Prescription(int id, Patient patient, boolean isValid, Date expireDate) {
        this.id = id;
        this.patient = patient;
        this.isValid = isValid;
        this.expireDate = expireDate;
    }
    //endregion Constructors

    //region Getters And Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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
    //endregion Getters And Setters
}
