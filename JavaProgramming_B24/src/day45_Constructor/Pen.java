package day45_Constructor;

public class Pen {

    String color;
    String type;
    int    size;


    public Pen(String color1, String type1){ //

        System.out.println("This pen color is " + color1 + " and  type is " + type1 + ".");
        color = color1;
        type = type1;
    }

    public static void main(String[] args) {

        Pen pen = new Pen("blue","pilot");

       // pen.color = "Yellow";
     //   System.out.println(pen.color);

        new  Pen("white","Big");

        new Pen("black","Grip");
    }



}
