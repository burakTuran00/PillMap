package project.PillMap.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Table(name = "patients")
@Entity
public class Patient {

    //region Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "gender")
    private Boolean gender;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mail")
    private String mail;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "subCity")
    private String subCity;

    @OneToMany(mappedBy = "patient")
    @JsonBackReference
    private List<Prescription> prescriptions;

    //endregion Properties

    //region Constructors
    public Patient() { }

    public Patient(int id, String name, String surname, Boolean gender, Date birthDate, String phone, String mail,
                   String address, String city, String subCity, List<Prescription> prescriptions) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.city = city;
        this.subCity = subCity;
        this.prescriptions = prescriptions;
    }

    //endregion Constructors

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    //endregion Constructors
}
