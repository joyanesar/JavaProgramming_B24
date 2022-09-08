package day49_Encapsulation;

public class Traffic {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("red");

//        System.out.println(light.color);
//        light.color = "brown";
//        System.out.println(light.color);
        System.out.println(light.getColor());
        light.setColor("green");
        System.out.println(light.getColor());

        light.setColor("green");
        System.out.println(light.getColor());



    }
}
