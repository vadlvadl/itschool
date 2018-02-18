package com.lizogub;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getFullAddress(){
        return (this.index + "\n" +
                            this.country + "," + this.city + "\n" +
                            this.street + ", " + this.house + ", ap. " + this.apartment);
    }

    public static void main(String[] args){
        Address address1 = new Address();
        address1.setIndex(43200);
        address1.setCountry("Ukraine");
        address1.setCity("Odessa");
        address1.setStreet("Gogolya st.");
        address1.setHouse("23/1");
        address1.setApartment("34");

        System.out.println(address1.getFullAddress());
    }
}
