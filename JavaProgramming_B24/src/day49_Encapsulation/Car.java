package day49_Encapsulation;

public class Car { // name of the file is car.java

    Driver driver;    // Driver instance // or reference
                      //String name ;    //String  instance
    public Car(String name, String licenseNumber, int age){ // constructor for car class
        driver = new Driver(name,licenseNumber,age);
    }
}
//    String driver; // name , license number,age
//    String engine; //cylinder, horsepower
 class Driver{
    String  name;
    String licenseNumber;
    int age;

     public Driver(String name, String licenseNumber, int age) { // creat new driver object
         this.name = name;
         this.licenseNumber = licenseNumber;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Driver{" +
                 "name='" + name + '\'' +
                 ", licenseNumber='" + licenseNumber + '\'' +
                 ", age=" + age +
                 '}';
     }

 }