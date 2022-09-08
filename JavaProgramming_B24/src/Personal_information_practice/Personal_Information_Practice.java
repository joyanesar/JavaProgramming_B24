package Personal_information_practice;

import java.util.Scanner;

public class Personal_Information_Practice {
    public static void main(String[] args) {
        /*
        Ask the user how many people they live with?if user lives with Less than 2 people: print "Live with less than 2 people"if the user lives with 3 -6 people: print "Live with 3 -6 people"if the user lives with more than 6 people: print "Live with "more than 6 people"Ask the user what city they live in?Ask the user if the live in downtown ("yes or no")if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")if they have thought about it print "do it its great", if they have not print "You should think about it"Ask the user their favorite animal?Print "Wow %animal is a great animal"Ask the user how many pets they want?Print "Interesting, do you want %numberOfPets %favoriteAnimals?",
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many people live with?");
        int user = input.nextInt();

        if (user < 2) {
            System.out.println("Live with less than two people");

        }else if (user >= 3 && user <= 6) {

            System.out.println("Live with 3 - 6  people");
        }else if (user > +6) {
                    System.out.println("Live more than 6");
                }else {
            System.out.println("Invalid entry");
            }
        input.nextLine();

        System.out.println("Which city you live in?");
        String cityName = input.next();

        System.out.println("Is user live in downTown");
        String downTown =input.next();

        if(downTown.equals("yes")){
            System.out.println("live in downTown");
        }

            System.out.println("have you thought about moving to the suburbs?");
            String suburbs = input.next();

            if(suburbs.equals("yes")){
                System.out.println("do it is great");
            }else {
                System.out.println("you should think about it");
            }
            input.nextLine();
        System.out.println("What is user's favorite animals?");
            String animal =input.nextLine();

            if(animal.equals("Horse")){
                System.out.println(" Wow !" + animal + " is great animal");
            }
        System.out.println("how many pets they want?");
            int pets = input.nextInt();

        System.out.println("Interesting, do you want " + pets + " " + animal + " ?");
            }

        }


