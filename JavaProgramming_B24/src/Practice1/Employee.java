package Practice1;

public class Employee {
    public static void main(String[] args) {
        String firstName            = "Nesar";
        String lastName             =  "Joya";
        String companyName          =  "Google";
        double salary           =   100000;
        int    startDay             =  5;
        int    startMonth           =  2;
        int    StartYear            =  2021;
        boolean FullTime            = true;
        String  jobTitle            = "SDET";
        String  officeAddress       =  "Rachester";

        System.out.println("My name is " +firstName + " and last name is "+lastName );
        System.out.println("I started my job on " +startDay +"/"+ startMonth + "/" + StartYear + " at " +companyName + " Company .");
        System.out.println("My base Salary is " + salary);
        System.out.println("After 3 Years Salary " +(salary  + startMonth * 100000));





    }
}
