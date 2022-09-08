package oopPractice.Car;

public class Drive {
    public static void main(String[] args) {


        Car car = new Car();
        car.speed =330;
        car.make = " BMw ";
        car.model = " 12456 ";


        car.drive();
        car.run();

        Car car1 = new Car();

        car1.make = "Toyata";
        car1.model = "corolla";
        car1.speed =220;
        car1.year = 2022;
        car1.run();


    }
}
