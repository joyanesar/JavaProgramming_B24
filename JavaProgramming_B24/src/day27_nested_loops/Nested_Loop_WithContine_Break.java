package day27_nested_loops;

public class Nested_Loop_WithContine_Break {
    public static void main(String[] args) {

        for(int i=1; i <= 3; i++){
//            if(i == 2){    // this breaks the outer loop, so it only has one iteraion
                            // that means we only see firs , second , second
//                break;
//            }

            System.out.println("first");


            for(int j= 1; j<=2; j++){

//                if(j==2){   // this breaks the inner loop,so only one iteration of the inner loop is run;
//                    break;
//                }
                System.out.println("second");
            }
        }

    }
}
