package project.PillMap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;

@Table(name = "medications")
@Entity
public class Medication {

    //region Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "form")
    private String form;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "prescription_required")
    private boolean prescriptionRequired;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private MedicationGroup medicationGroup;


    //endregion Properties

    //region Constructors

    public Medication() {}

    public Medication(int id, String name, String dosage, String form, String description,
                      Double price, boolean prescriptionRequired, MedicationGroup medicationGroup) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.form = form;
        this.description = description;
        this.price = price;
        this.prescriptionRequired = prescriptionRequired;
        this.medicationGroup = medicationGroup;
    }
    //endregion Properties

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }

    public void setPrescriptionRequired(boolean prescriptionRequired) {
        this.prescriptionRequired = prescriptionRequired;
    }

    public MedicationGroup getMedicationGroup() {
        return medicationGroup;
    }

    public void setMedicationGroup(MedicationGroup medicationGroup) {
        this.medicationGroup = medicationGroup;
    }

    //endregion Getters and Setters
}