package project.PillMap.model;

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

    @OneToOne
    private Brand brand;

    @Column(name = "price")
    private double price;
    //endregion Properties

    //region Constructors

    public Medication() {}

    public Medication(int id, String name, String dosage, String form, String description, Brand brand, double price) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.form = form;
        this.description = description;
        this.brand = brand;
        this.price = price;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //endregion Getters and Setters
}
