package day40_arrayList;

public class ParseVsValueOf {
    public static void main(String[] args) {

        String str = "30";
        System.out.println(str + 5);

       // System.out.println(s < 6); it is not work this way

        int seconds = Integer.parseInt(str); // this line converts the "30" String into the int value of 30

        System.out.println(seconds < 60);

       Integer num = Integer.valueOf(str);
        System.out.println(num);

        String s2 = String.valueOf(seconds); //Converts the int seconds of 30 to the String object
        System.out.println(s2);




    }
}
