package project.PillMap.dto;

import jakarta.persistence.*;
import project.PillMap.entity.Prescription;

import java.util.Date;
import java.util.List;

public class PatientDto {

    private int id;
    private String name;
    private String surname;
    private Boolean gender;
    private Date birthDate;
    private String phone;
    private String mail;
    private String address;
    private String city;
    private String subCity;
    private List<PrescriptionDto> prescriptions;

    //region Constructor

    public PatientDto() {
    }

    public PatientDto(int id, String name, String surname, Boolean gender, Date birthDate, String phone,
                      String mail, String address, String city, String subCity, List<PrescriptionDto> prescriptions) {
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

    //endregion Constructor

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

    public List<PrescriptionDto> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<PrescriptionDto> prescriptions) {
        this.prescriptions = prescriptions;
    }

    //endregion Getters and Setters
}
