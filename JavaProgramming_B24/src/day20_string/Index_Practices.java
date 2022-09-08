package day20_string;

public class Index_Practices {
    public static void main(String[] args) {


        String word = "banana";

        int firstA = word.indexOf('a');
      // int middleA = word.indexOf('a',2); // hardcoded

        int middleA = word.indexOf('a',firstA +1);

        //int lastA = word.lastIndexOf('a');
        int lastA = word.lastIndexOf('a',middleA +1);

        int firstN = word.indexOf('n');
        int secondN = word.indexOf('n',3);


        //System.out.println(firstN);
        //System.out.println(secondN);
        System.out.println(firstA);
        System.out.println(middleA);
        System.out.println(lastA);


        String s = "001011010";
                    //12345678
        int positionOne = s.indexOf('1',2); //2
        int positionTwo = s.indexOf('1',positionOne+1);
        int positionThree = s.indexOf('1',positionTwo+1);
        int positionFour  = s.indexOf('1',positionThree+1);
        int positionFive  = s.indexOf('1',positionFour +1);
        int positionSix   = s.indexOf('1',positionFive +1);



        System.out.println(positionOne);
        System.out.println(positionTwo);
        System.out.println(positionThree);
        System.out.println(positionFour);
        System.out.println(positionFive);
        System.out.println(positionSix);
        System.out.println(s.length());




    }

}
