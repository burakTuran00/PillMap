package project.PillMap.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

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

    @OneToOne
    @JoinColumn(name = "prescription_detail_id")
    @JsonBackReference
    private PrescriptionDetail prescriptionDetail;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @JsonBackReference
    private MedicationGroup medicationGroup;

    @OneToOne
    @JoinColumn(name = "stock_id")
    @JsonBackReference
    private Stock stock;


    //endregion Properties

    //region Constructors

    public Medication() {}

    public Medication(int id, String name, String dosage, String form, String description, Double price,
                      boolean prescriptionRequired, PrescriptionDetail prescriptionDetail, MedicationGroup medicationGroup, Stock stock) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.form = form;
        this.description = description;
        this.price = price;
        this.prescriptionRequired = prescriptionRequired;
        this.prescriptionDetail = prescriptionDetail;
        this.medicationGroup = medicationGroup;
        this.stock = stock;
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

    public PrescriptionDetail getPrescriptionDetail() {
        return prescriptionDetail;
    }

    public void setPrescriptionDetail(PrescriptionDetail prescriptionDetail) {
        this.prescriptionDetail = prescriptionDetail;
    }

    public MedicationGroup getMedicationGroup() {
        return medicationGroup;
    }

    public void setMedicationGroup(MedicationGroup medicationGroup) {
        this.medicationGroup = medicationGroup;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }


    //endregion Getters and Setters
}