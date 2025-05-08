package project.PillMap.dto;

import jakarta.validation.constraints.Email;

import java.util.Date;

public class PatientDto {
    private String name;
    private String surname;
    private Boolean gender;
    private Date birthDate;
    private String phone;
    private String mail;
    private String address;
    private String city;
    private String subCity;

    //region Constructor

    public PatientDto() {
    }

    public PatientDto(String name, String surname, Boolean gender, Date birthDate,
                      String phone, String mail, String address, String city, String subCity) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.city = city;
        this.subCity = subCity;
    }
    //endregion Constructor

    //region Getters And Setters

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

    //endregion Getters And Setters
}
