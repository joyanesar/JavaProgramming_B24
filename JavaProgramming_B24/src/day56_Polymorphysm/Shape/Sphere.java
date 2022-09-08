package day56_Polymorphysm.Shape;

public class Sphere extends  Shape implements HasVolume{


    double radius;
    @Override
    public double volume() {
        return (4/3) * Math.PI * radius * radius * radius; // math.pow(radius,3)
    }

    @Override
    public double area() {
        return Math.PI * 4 * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return  2 * Math.PI * radius;
    }
}
