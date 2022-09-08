package day11_If_Statments;

import java.security.SecureRandom;

public class IfPractice {
    public static void main(String[] args) {



        double hourlyRate = 10.5;
        double hoursWorked= 45;
        double netPay ;

        String  message;

        if(hoursWorked > 40){
            //overTime calculation
            double overTimeHours = hoursWorked - 40;
            netPay = 40 * hourlyRate;
            netPay += overTimeHours * hourlyRate * 1.5;

            message = "Wow you worked " + hoursWorked + " hours so you got paid for " + overTimeHours + " hours overtime , so your total net pay is $"+netPay;

        }else {
            netPay = hoursWorked * hourlyRate;
            message = "You worked " + hoursWorked + " hour ,Your total net pay is " + netPay;
        }
        System.out.println(message);

    }

}
