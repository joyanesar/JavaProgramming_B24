package oopPractice;

public class FizBuzz {

    public static String FizzBuzz(int num) {

        String result = "";

        for(int i = 0 ; i < num; i++){

            if(num % 3 == 0 && num % 5 ==0){

                result = "FizzBuzz";

            }
            if(num % 3 == 0){
                result = "Fizz";
            }
            if(num % 5 == 0){
                result = "Buzz";

                return result.isEmpty() ? " " + num : result;
            }
        }


        return result;




    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz(25));
        System.out.println(FizzBuzz(13));
        System.out.println(FizzBuzz(35));
    }
}
