package project.PillMap.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pharmacies")
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "city")
    private String city;

    @Column(name = "subCity")
    private String subCity;

    @Column(name = "address")
    private String address;

    @Column(name = "on_duty")
    private boolean onDuty;

    @OneToMany(mappedBy = "pharmacy")
    private List<Stock> stocks;

    //region Constructors

    public Pharmacy() {
    }

    public Pharmacy(int id, String name, String phone, String city, String subCity, String address, boolean onDuty, List<Stock> stocks) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.subCity = subCity;
        this.address = address;
        this.onDuty = onDuty;
        this.stocks = stocks;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubCity() {
        return subCity;
    }

    public void setSubCity(String subCity) {
        this.subCity = subCity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }


    //endregion Getters and Setters
}
