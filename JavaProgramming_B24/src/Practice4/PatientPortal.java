package Practice4;

import java.util.Scanner;

public class PatientPortal {
    public static void main(String[] args) {

        String firstName,lastName,fullName,email,street,state,city,address,contacts;
        int    age,zipCode;
        double height,weight;
        boolean isMarried;//for marriage status.
        long    workPhoneNumber,personalPhoneNumber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first Name");
        firstName = scan.nextLine();

        System.out.println("Enter your last name");
        lastName = scan.nextLine();

        System.out.println("Enter your email");
        email = scan.nextLine();
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your city");
        city = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        System.out.println("Enter your  work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married");
        isMarried = scan.nextBoolean();


        fullName = (lastName +","+ firstName);
        address  = (street + ","+ city + ","+state+""+ zipCode);

        contacts = ("work phone number -"+workPhoneNumber + ",personal phone number -" + personalPhoneNumber +",email:"+ email);

        System.out.print("Patient personal information \nFull name: " + fullName +  "\nAdress: " +
                address +"\nContacts:"+ contacts + "\nAge: "+ age + "\nHeight: "+height + "\nWeight:" +
                " "+ weight +"pounds\nMarried: "+isMarried);


    }
}
