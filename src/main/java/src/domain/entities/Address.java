package src.domain.entities;

import jakarta.persistence.Column;

public class Address {

    public Address(){}

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Address(String cep, String state, String city, String neighborhood, String streetName, Integer streetNumber) {
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }
    @Column(name = "cep")

    String cep;
    @Column(name = "state")

    String state;
    @Column(name = "city")
    String city;
    @Column(name = "neighborhood")
    String  neighborhood;
    @Column(name = "streetName")

    String streetName;
    @Column(name = "streetNumber")

    Integer streetNumber;

}
