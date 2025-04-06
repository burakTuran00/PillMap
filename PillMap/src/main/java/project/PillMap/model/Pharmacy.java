package project.PillMap.model;


import jakarta.persistence.*;

@Table(name = "pharmacies")
@Entity
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Stock stock;

    @Column(name = "on_duty")
    private Boolean onDuty;
}
