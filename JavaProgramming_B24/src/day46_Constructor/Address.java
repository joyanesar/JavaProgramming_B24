package day46_Constructor;

public class Address {

    String street ;
    String city;
    String state;
    String zipcode;
    String country ;

    public Address(String street, String city, String state, String zipcode){

       this. street = street;
       this.city = city;
       this.state = state;
       this. zipcode = zipcode;
       this.country = "US";

    }

    @Override
    public String toString() {
        return "James Bond Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address add = new Address("34thSt","Chicago","CL","02148");

        System.out.println(add);
        System.out.println(add.city);
        System.out.println(add.state);
    }


}
