package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Find_Days {

    /*
    Creat a mehtod that will return an Arraylist with all the days
    Monday, Tuesday ... sunday

    Overload the method so it accept the int number - which day of the week they want
    String
    intput = 1

    output : Monday

         */
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays(2));
        System.out.println(getDays(7));
        ArrayList<String>days = getDays();
        System.out.println(days.containsAll(Arrays.asList("Monday","Friday","Sunday")));
        /*
        if you wanted to this the same checking for 1 element at a time:
        days.contains("Monday") && days.contains("Friday") && days.contains("sunday")
         */
        System.out.println(days.containsAll(Arrays.asList("Monday","April","Sunday")));
    }

    public static ArrayList<String> getDays(){

        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

       ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

       return  daysInList;

    }
    public static String getDays(int day){
        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));


        return daysInList.get(day - 1);
    }


}
