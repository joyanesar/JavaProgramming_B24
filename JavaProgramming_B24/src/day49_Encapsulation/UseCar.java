package day49_Encapsulation;

public class UseCar {
    public static void main(String[] args) {


        Car car = new Car("James", "LC12456", 40);

        System.out.println(car.driver);
        System.out.println(car.driver.name);
        System.out.println(car.driver.age);
        System.out.println(car.driver.licenseNumber);

        Car car2 = new Car("Adam","43545d",52);
        System.out.println(car2.driver.age);
    }

}
