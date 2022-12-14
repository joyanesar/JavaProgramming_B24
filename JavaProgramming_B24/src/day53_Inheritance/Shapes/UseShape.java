package day53_Inheritance.Shapes;

public class UseShape {
    public static void main(String[] args) {


        Shape shape = new Shape("shape");
        System.out.println(shape.name);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        System.out.println();

        Square square = new Square(5);
        System.out.println(square.name);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        Circle circle = new Circle(3.5);
        System.out.println(circle.name);
        System.out.println(circle.radius);
        System.out.println(circle.perimeter());
    }
}
