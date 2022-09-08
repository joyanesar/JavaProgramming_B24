import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer>num = new ArrayList<>(Arrays.asList(1,0,2,0,3,4,0));

        System.out.println(num);

//        ArrayList<Integer>num2 = new ArrayList<>();
//
//        for(int each : num){
//
//            if(each !=0){
//                num2.add(each);
//            }
//        }
//
        for(int i =0; i < num.size()-1; i++){

            if(num.contains(0)){
                num.remove(0);
                    i--;
            }
        }

        System.out.println(num);
       // System.out.println(num2);

    }

}
