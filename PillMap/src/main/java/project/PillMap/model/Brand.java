package project.PillMap.model;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "brands")
@Entity
public class Brand {

    //region Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "address")

    @OneToOne
    private Manufacturer manufacturer;

    @Column(name = "website")
    private String website;

    @Column(name = "establishment_year")
    private Date establishmentYear;
    //endregion Properties

    //region Constructors

    public Brand() {}

    public Brand(int id, String name, Manufacturer manufacturer, String website, Date establishmentYear) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.website = website;
        this.establishmentYear = establishmentYear;
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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(Date establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    //endregion Getters and Setters
}
