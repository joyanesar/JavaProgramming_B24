package day36_Methods;

public class DaysInAWeek {
    /*
    make method that will accept a number

    and which day of the week it is
     1- monday
     2- tuesday
     3- wed
     4- thursday
     5- fri
     6 - sat
     7- sun


     */
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(2));
        System.out.println(getDayOfWeek(1));
        String day = getDayOfWeek(1);
        System.out.println(day.charAt(0));

        String day2 = getDayOfWeek(10); // testing the invalid day!
        System.out.println(day2);
        System.out.println(day2.equals("Not a valid day")); //
    }
    public static String getDayOfWeek(int number){
        String day = "";

        switch (number){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day ="wed";
                break;
            case 4:
                day ="Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Sat";
                break;
            case 7:
                day = "Sun";
                break;
            default:
                day = "Not a valid day";
        }
        return  day;
    }
}
