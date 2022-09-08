package day19_string;

public class MultipleIndexes {
    public static void main(String[] args) {




        String  word = "definition";
        //              0123456789
        System.out.println("First i position : " + word.indexOf('i'));
        System.out.println("Last i position : " + word.lastIndexOf('i',8));

        int secondIHardCoded = word.indexOf('i', 4);
        System.out.println(secondIHardCoded);
        int firsPos = word.indexOf("i"); // 3
        int secondPos = word.indexOf("i", firsPos + 1); // in this example is  starts to look from position 4

        int thirdPos = word.indexOf("i", secondPos +1);


        System.out.println("First pos " + firsPos);
        System.out.println("Second pos" + secondPos);
        System.out.println("Third pos " + thirdPos);



        String a = "aaa";
        System.out.println(a.indexOf('a')); // this one olny read the positon of a which is 0
        System.out.println(a.indexOf('a', a.indexOf('a'))); // this gives the same value of a = 0
        System.out.println(a.indexOf('a',+2)); // this 2 added to the value of a which is 0+3 = 3
        System.out.println(a.indexOf('a',a.indexOf('a') +3)); // this one find the position of a and add 3
        //System.out.println(a.lastIndexOf('a'));
    }
}
