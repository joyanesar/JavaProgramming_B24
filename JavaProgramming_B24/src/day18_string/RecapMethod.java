package day18_string;

public class RecapMethod {
    public static void main(String[] args) {


        String  day = "thursDAY";


//        boolean  b = day.equals("Thursday");
//        System.out.println(b);

        System.out.println(day.equalsIgnoreCase("Thursday"));

        day.equals("thursday");
        System.out.println(day);

        day = day.toUpperCase();

        System.out.println(day);
        System.out.println(day.toLowerCase());
        System.out.println(day);
        day = day.toLowerCase();
        System.out.println(day);
        System.out.println(day.length() + 1 ); // 8 (int) 1 + 1 (int) -> 9
        System.out.println(day); // 9

        day = day.length() + " "; // tyoes: int + String -> concatenation
        System.out.println(day + 2);

        System.out.println(day.length() +1);

        System.out.println("5 + 2 = " + 5 + 2);
        System.out.println( "5 + 2 = " + (5 + 2));


        String s = "      hello         world       ";
        System.out.println(s);
        s.trim();
        System.out.println(s);
        int num = 15;
        String msg = "";
        msg = "    Value for the num is      " + num;


        System.out.println(msg);



    }
}
