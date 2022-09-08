package Practice1;

public class House {
    public static void main(String[] args) {
        String       houseType          = "Apartment";
        int          numberOfBedrooms   =  4;
        byte         numberOfBathrooms  =  3;
        byte         numberOfKitchens   =  1;
        boolean      isThereBasement    = true;
        boolean      isThereAnAttic     = false;
        boolean      isTherePool        = false;
        boolean      isTheHouseForSale  = true;
        long         CostOfHouse          = 150_000_000_000L;
        String       address            = "FifthAvenue";
        String       city               = "WaterVliet";
        int          zipCode            = 12189;
        boolean      isParkingNearBy    = true;
        String       ratingOfSurroundingSchoolDistricts  = "**** Out Of ******";

        System.out.println("Nice "+houseType + " for sale!");
        System.out.println("It has "+numberOfBedrooms + " bedrooms");
        System.out.println("And " + numberOfBathrooms + " Bathrooms");
        System.out.println("Number of Kitchen "+ numberOfKitchens +".");
        System.out.println("It has big Basement " + isThereBasement);
        System.out.println("There is an Attic" + isThereAnAttic);
        System.out.println("Swimming pool"+isTherePool);
        System.out.println("It is for sale"+isTheHouseForSale);
        System.out.println("The value of this House is $"+ CostOfHouse);
        System.out.println("It is located at "+ address + "City of " + city);
        System.out.println("ZipCode for this address is "+ zipCode);
        System.out.println("It has a large  parking "+ isParkingNearBy);
        System.out.println(ratingOfSurroundingSchoolDistricts);


    }
}
