package day53_Inheritance.Shapes;

public class Circle extends Shape{
    double radius ;

    public Circle(double radius) {
        super("Circle"); // super() reference to parent
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
        //Math.PI * Math .pow(radius,2)
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}

