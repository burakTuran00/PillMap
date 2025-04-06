package project.PillMap.model;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "stocks")
@Entity
public class Stock {

    //region Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    private Pharmacy pharmacy;

    @ManyToMany(mappedBy = "stock")
    private List<Medication> medications;

    @Column(name = "quantity")
    private int quantity;
    //endregion

    //region Constructors

    public Stock() {
    }

    public Stock(int id, Pharmacy pharmacy, List<Medication> medications, int quantity) {
        this.id = id;
        this.pharmacy = pharmacy;
        this.medications = medications;
        this.quantity = quantity;
    }
//endregion Constructors

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //endregion Getters and Setters
}
