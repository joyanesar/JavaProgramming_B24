package day55_abstraction.Exercise;

public class Running extends Exercise {
    @Override
    public void perform(){
        System.out.println("Running");

    }

       @Override
    public void getCaloriesBurned(int minutes){
           System.out.println("Burning 1000 Calories When I use abstract method in " +   45 + " minutes");
       }

    public static void main(String[] args) {
        Running running = new Running();

        running.getCaloriesBurned(100);
    }

}
