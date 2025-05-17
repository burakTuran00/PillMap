package project.PillMap.dto;

public class PharmacyDto {
    private int id;
    private String name;
    private String phone;
    private String city;
    private String subCity;
    private String address;
    private boolean onDuty;

    //region Constructor

    public PharmacyDto() {
    }

    public PharmacyDto(int id, String name, String phone, String city, String subCity, String address, boolean onDuty) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.subCity = subCity;
        this.address = address;
        this.onDuty = onDuty;
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

    //endregion Getters and Setters
}
