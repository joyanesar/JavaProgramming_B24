package Office_Hours;

import java.util.Arrays;

public class Zombie_Attacks {
    public static void main(String[] args) {

        /*
        3 conditions / action

        if your 0 in the begining
              cause the city to the right to lose half pop

          if you are o in the end
                cause the city to the left to lose half pop

           if you are int middle anywhere
                cause the city to the left and right to both lose half pop

            when to stop?
              when all cities pop are 0

              Arrays(inhab, new int [8]
              [0,0,0,0,0,0,0,0]
         */

        int [] inhabitants = {3, 6, 0, 4 ,3 , 2, 7, 0};

        int days = 0;
        System.out.println("Day " + days++ + " " + Arrays.toString(inhabitants));

        while (!Arrays.equals(inhabitants, new int [8])){

            int[] temp = Arrays.copyOf(inhabitants, inhabitants.length);

            for(int i = 0; i < inhabitants.length; i++){

                if(inhabitants[i] == 0){

                    if( i == 0){
                        //We found the first index // this is the first index

                        temp[ i + 1]  = temp [i + 1] / 2;

                    }else if(i == inhabitants.length -1){
                        // we found 0 at the last index , last city
                        temp[ i - 1]  = temp [i - 1] / 2;
                    }else {
                        // we found o somewhere in the middle
                        temp[ i + 1]  = temp [i + 1] / 2;
                        temp[ i - 1]  = temp [i - 1] / 2;
                    }
                }
            }
            inhabitants = Arrays.copyOf(inhabitants, inhabitants.length);  // copied
            System.out.println("Day " + days++ + " " + Arrays.toString(inhabitants));

        }
    }
}
