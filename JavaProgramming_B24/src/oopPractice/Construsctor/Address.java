package oopPractice.Construsctor;

import day54_abstruction.hiding.A;

public class Address {
    String street;
    String city;
    String state;
    String zipcode;
    String country;

    public  Address(String street, String city, String state, String zipcode){

        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        country = "US";

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("22ndAvenue","albany","ny","12489");
        System.out.println(address);
    }
}
