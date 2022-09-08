package Practice4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber  = "(" + areaCode + ")" + "-" + localNumber;
        System.out.println("Calling number"+ phoneNumber);


    }
}
