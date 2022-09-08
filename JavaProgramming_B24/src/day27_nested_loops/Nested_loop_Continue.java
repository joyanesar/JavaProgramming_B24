package day27_nested_loops;

public class Nested_loop_Continue {
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++) { // outer loop

            System.out.println("first"); // inner loop


            for(int j= 1; j<=3; j++){

                if(j == 2){
                    continue;   // skip
                }
                System.out.println("second" + " i:" + i + "j:" + j);
            }
        }
    }
}