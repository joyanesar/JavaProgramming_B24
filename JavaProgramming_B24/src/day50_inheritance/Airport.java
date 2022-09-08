package day50_inheritance;

public class Airport {
    public static void main(String[] args) {

        FlightTicket flightTicket = new FlightTicket("firstClass ","New York","Miami AirPort");

       // flightTicket.type;//we cannot access directly flightTicket.type // departure/arrival

        System.out.println("Flight Type " + flightTicket.getType());
        System.out.println(" From " + flightTicket.getDepartureLocation());
        System.out.println(" To " + flightTicket.getArrivalLocation());
    }
}
