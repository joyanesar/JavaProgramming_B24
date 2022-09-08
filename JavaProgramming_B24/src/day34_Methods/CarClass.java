package day34_Methods;

public class CarClass {
    /*
       Unlock and open the door
        Get into the car and close door
        Put seatbelt on
        Check mirrors
        Start car
        Put into drive and press gas petal
     */
    public static void main(String[] args) {
//        unlockAndOpenDoor();
//        getIntoCarCloseDoor();
//        putOnSeatBelt();
//        checkMirrors();
//        startCar();
//        drive();
        driveInHurry();
    }
    public static void unlockAndOpenDoor(){ // method body starting brace and close

        System.out.println("Unlock and open the door");

    }
    public static void getIntoCarCloseDoor(){
        System.out.println("getIntoCarCloseDoor");
    }
    public static void putOnSeatBelt(){
        System.out.println("putOnSeatBelt");

    }
    public static void checkMirrors(){
        System.out.println("Checking the left mirrors");
        System.out.println("Checking the right mirrors");
        System.out.println("Checking the rear view mirror");
    }
    public static void  startCar(){
        System.out.println("Putting key in and turn to start it");

    }
    public static void drive(){
        System.out.println("Putting the car into drive and press the gas pedal");
    }
    public static void driveInHurry(){
        unlockAndOpenDoor();
        getIntoCarCloseDoor();
        startCar();
        drive();
    }
}
