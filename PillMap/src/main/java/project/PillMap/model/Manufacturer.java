package project.PillMap.model;

import jakarta.persistence.*;

@Table(name = "manufacturers")
@Entity
public class Manufacturer {

    //region Properties
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

    @Column(name = "country")
    private String country;

    @Column(name = "website")
    private String website;
    //endregion Properties

    //region Constructors
    public Manufacturer() { }

    public Manufacturer(String name, String address, String phone, String country, String website) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.country = country;
        this.website = website;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    //endregion Getters and Setters
}
