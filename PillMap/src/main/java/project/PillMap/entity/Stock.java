package project.PillMap.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "medication_id", referencedColumnName = "id")
    private Medication medication;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "pharmacy_id", referencedColumnName = "id")
    private Pharmacy pharmacy;

    //region Constructors

    public Stock() {
    }

    public Stock(int id, Medication medication, int quantity) {
        this.id = id;
        this.medication = medication;
        this.quantity = quantity;
    }
//endregion Properties

    //region Getters and Setters

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    //endregion Getters and Setters
}
