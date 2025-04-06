package project.PillMap.model;

import jakarta.persistence.*;

import java.util.Date;

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
    //endregion Properties

    //region Constructors
    public Patient() { }
    public Patient(String name, String surname, Boolean gender, Date birthDate, String phone, String mail) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phone = phone;
        this.mail = mail;
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

    //endregion Constructors
}
