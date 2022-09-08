package day49_Encapsulation;

public class TrafficLight {


    String color;

    public TrafficLight(String color) {
        this.color = color;
    }
    public String getColor(){
        return  color;
    }
    public void setColor(String color){
         switch (color){
             case  "red":
             case  "green":
             case  "Yellow":
                 this.color = color;
                 break;
             default:
                 System.out.println(color + " is not valid for traffic light" );
         }

    }
}
