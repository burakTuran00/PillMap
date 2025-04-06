package project.PillMap.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Table(name = "prescriptions")
@Entity
public class Prescription {

    //region Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "prescription")
    private List<Patient> patient;

    @Column(name = "isValid")
    private Boolean isValid;

    @Column(name = "expireDate")
    private Date expireDate;

    //endregion Properties

    //region Constructors

    public Prescription() {}

    public Prescription(int id, List<Patient> patient, Boolean isValid, Date expiteDate) {
        this.id = id;
        this.patient = patient;
        this.isValid = isValid;
        this.expireDate = expiteDate;
    }
    //endregion Constructors

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    //endregion Getters and Setter
}
