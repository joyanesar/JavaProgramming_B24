package day49_Encapsulation;

public class Shape {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(-10,-20);


        //System.out.println(rectangle.lenght);cant access
        //System.out.println(rectangle.width); cause privat
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        rectangle.setWidth(10);
        rectangle.setLength(20);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle.calculateArea());
    }
}
