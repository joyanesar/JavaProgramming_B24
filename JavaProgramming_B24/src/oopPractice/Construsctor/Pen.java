package oopPractice.Construsctor;

public class Pen {

    String color;
    double price;


    public Pen( String str){
        System.out.println("Made pen object");


    }

    public static void main(String[] args) {
        Pen pen = new Pen("");
        pen.color = "white";

        System.out.println(pen.color);



    }
}
