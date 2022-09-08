package day07_unary_operators;

public class TicketPrice1 {
    public static void main(String[] args) {

        String cityOne    = " Chicago";
        String cityTwo    = "Virginia";
        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;

        double totalPriceAfterMiles = baseTicketPrice + milesBetweenCities /10;
        System.out.println("The ticket Price from " + cityOne + " to " + cityTwo+ " is $" +totalPriceAfterMiles);

        float f = 40;
        long  l = 10;
        double result = f * l;

        long result3 = (long)f;
        System.out.println(result);
        System.out.println(result3);

        double h = (double) l;
        System.out.println(h);

        double y = (double) f;
        System.out.println(y);

        long n = (long) (f*l);
        System.out.println(n);

    }

}
