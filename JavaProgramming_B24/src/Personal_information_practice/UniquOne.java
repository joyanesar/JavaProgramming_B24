package Personal_information_practice;

public class UniquOne {
    public static void main(String[] args) {
        /*
        applealego through the String char by charago through the String char by char
         */
        String fruit = "apple";

        for(int i=0; i<fruit.length(); i++){

            int count =0;

            for(int j=0; j<fruit.length(); j++){

                if(fruit.charAt(i) == fruit.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(fruit.charAt(i));
            }
        }

    }
}
