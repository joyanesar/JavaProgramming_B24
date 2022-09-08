package day45_Constructor;
public class Car {
    String ownerName;
    String make;
    String model;
    String color;
    int    year;
    boolean isHybrid;
    String  bodyType;
    int    speed;
    String  madeIn;
    double price;

    //Constructor
    public Car(String driverName, String makeCar, String modelCar, String bodyColor, int modelYear,
               boolean isCarHybrid ,String bodyShape,int carSpeed, String made , double carPrice){

        System.out.println("Nadir's Car Information");
        ownerName   = driverName;
        make   = makeCar;
        model  = modelCar;
        color  = bodyColor;
        year   = modelYear;
        isHybrid = isCarHybrid;
        bodyType = bodyShape;
        speed   = carSpeed;
        madeIn  = made;
        price   = carPrice;

    }
    @Override
    public String toString() {
        return "CarInfo:{" +
                "OwnerName='" + ownerName +
                ", Make='" + make +
                ", Model='" + model +
                ", Color='" + color +
                ", Year=" + year +
                ", isHybrid=" + isHybrid +
                ", BodyType='" + bodyType +
                ", Speed/h=" + speed +
                ", MadeIn='" + madeIn +
                ", Price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Car car = new Car("Nadir","BMW","CT200","White",2022,false,"Coup",220,"Germany",1790.900);
        System.out.println(car);

    }
}
