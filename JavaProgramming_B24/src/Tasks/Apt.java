package Tasks;

public class Apt {
    public static void main(String[] args) {
        String address = "123 Virginia Ave, VA 22222",
                nameOfOwner = "Crystal City",
                phoneNumber = "xxx-xxx-xxxx";

        int numberOfUnits = 2500,
                averageSizeOfUnit = 1500, // Sq.Ft
                totalNUmberOfResidents = 9560,
                numberOfParking = 3000;

        double monthlyRent = 1500.00,
                numberOfReviewStars = 4.2;

        short numberOfWashAndDry = 10,
                lengthOfLease = 12,  // months
                numberOfFloors = 5;


        boolean allowsPet = true,
                hasAPool = true,
                isNearGasStation = true,
                hasABasement = false,
                hasAvailableUnitsForRents = true,
                hasAirConditioning = true,
                hasWheelChairAccess = true;
        //Creating variables using previous variables to get the values

        double newRentAfter3Years = monthlyRent * 0.9,    //Monthly Rent after 3 years
                newRentAfter6Years = monthlyRent * 0.8,   //Monthly Rent after 6 years
                averageNumberOfResidentsPerUnit = totalNUmberOfResidents / numberOfUnits,
                averageNumberOfParkingSpotsPerUnit = numberOfParking / numberOfUnits,
                averageNumberOfUnitsPerFloor = numberOfUnits / numberOfFloors;
        System.out.println("Apartment General Information:\n");
        System.out.println("Address: \t\t\t\t\t\t\t\t" + address +
                "\nName of owner: \t\t\t\t\t\t\t" + nameOfOwner +
                "\nNumber of units: \t\t\t\t\t\t" + numberOfUnits +
                "\nAverage size of each unit: \t\t\t\t" + averageSizeOfUnit +
                "\nMonthly rent amount: \t\t\t\t\t$" + monthlyRent +
                "\nNumber of washers and driers: \t\t\t" +numberOfWashAndDry +
                "\nAllows Pets: \t\t\t\t\t\t\t" + allowsPet +
                "\nHas a pool: \t\t\t\t\t\t\t" + hasAPool +
                "\nLength of lease: \t\t\t\t\t\t" + lengthOfLease +
                "\nTotal number of residents in building: \t" + totalNUmberOfResidents +
                "\nPhone number of owner: \t\t\t\t\t" + phoneNumber +
                "\nIt is near a gas station: \t\t\t\t" + isNearGasStation +
                "\nNumber of floors: \t\t\t\t\t\t" + numberOfFloors +
                "\nHas a basement: \t\t\t\t\t\t" + hasABasement +
                "\nHas available units for rent: \t\t\t" + hasAvailableUnitsForRents +
                "\nHas air conditioning: \t\t\t\t\t" + hasAirConditioning +
                "\nNumber of parking spaces: \t\t\t\t" + numberOfParking +
                "\nHas wheel chair access: \t\t\t\t" + hasWheelChairAccess +
                "\nNumber of review stars (out of 5): \t\t" + numberOfReviewStars + "\n");



        System.out.println("Updated Numbers: \n");
        System.out.println("Monthly rent after 3 years (discount 10% off original rent): \t" + newRentAfter3Years +
                "\nMonthly rent after 6 years (discount 20% off original rent): \t" + newRentAfter6Years +
                "\nAverage number of residents per unit: \t\t\t\t\t\t\t" + averageNumberOfResidentsPerUnit +
                "\nAverage number of parking spots per unit: \t\t\t\t\t\t" + averageNumberOfParkingSpotsPerUnit +
                "\nAverage number of units per floor: \t\t\t\t\t\t\t\t" + averageNumberOfUnitsPerFloor);
    }
}
