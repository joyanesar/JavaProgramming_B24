package Office_Hours;

public class FrequencyOfMethod {



        /*
        find the frequency of a specific characters
        { "apple", "ape", "java"}
        'a'
        > 4
         */
        public static void main(String[] args) {

            String[] arr = {"apple", "ape", "jAva"};
            System.out.println(frequencyOfChar(arr , 'a'));
            System.out.println(frequencyOfChar(arr, 'A'));
        }
        public static int frequencyOfChar (String [] word , char letter){

            int count = 0;
            for(String eachWord : word){

                for(char eachLetter: eachWord.toCharArray()){

                    if(eachLetter == letter){
                        count++;
                    }

                }
            }
            return  count;
    }
}
