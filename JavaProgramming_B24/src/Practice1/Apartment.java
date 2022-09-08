package Practice1;

import java.util.Arrays;

public class Apartment {
    public static void main(String[] args) {

        String          address                                       = "sixthAvenue";
        String          ownerName                                     = "Mike";
        byte            numberOfUnits                                 =  6;
        double         averageSizeOfEachUnit                          = 28.45;
        int             monthlyRent                                   = 900;
        byte            numberOfWashers                               =  2;
        byte            numberOfDriers                                =  2;
        boolean         allowsPets                                    = false;
        boolean         hasAPool                                      = true;
        int             lengthOfLease                                 = 12;
        int             totalNumberResidentsInTheBuilding             = 10;
        long           phoneNumber                                    = 518_961_889_5L;
        boolean        isNearToGasStation                             = true;
        int             numberOfFloorsBasements                       = 9;
        boolean         hasAvailableUnitsForRent                      =  false;
        boolean         hasAirConditioning                            = true;
        short           numberOfParking                               = 8;
        boolean         hasWheelChairAccess                           = true;

        int             numberOfViewStars                             =  5;


        System.out.println("Apartment for rent available at "+ address);
        System.out.println("The owner of this Apartment is " + ownerName);
        System.out.println("The Apart has " + numberOfDriers + " units avgSizeEachUnits is " + averageSizeOfEachUnit +"Suarefeet");
        System.out.println("Monthly Rent is " + monthlyRent);
        System.out.println("It has " + numberOfUnits + " including " + numberOfWashers + " each  and " + numberOfDriers + " Driers" );
        System.out.println("Pets are ot allowed " + allowsPets );
        System.out.println("Its has prety " + hasAPool);
        System.out.println("length of of leas is for " + lengthOfLease + "and total resident " + totalNumberResidentsInTheBuilding);
        System.out.println("His phone num " + phoneNumber);
        System.out.println("Its close to GasStation " + isNearToGasStation );
        System.out.println("Number Of basement " + numberOfFloorsBasements + "and has some units for rent " + hasAvailableUnitsForRent);
        System.out.println("It include air center " + hasAirConditioning + "numberOf parking is " + numberOfParking);
        System.out.println("WheelChair always avialble " + hasWheelChairAccess);
        System.out.println("Number of star out of " + numberOfViewStars);





    }
}
