package day46_Constructor;

public class Offer {


    String  location;
    String  company;
    double salary;
    boolean fullTime;
    int numberOfPTO;

    public Offer(String company, double salary, boolean isFullTime) {

        this.company = company;
        this.salary = salary;
        this.fullTime = isFullTime;
    }

    public Offer(String location, String company, double salary, boolean fullTime, int numberOfPTO){

        this.location = location;
        this.company = company;
        this.salary = salary;
        this.fullTime = fullTime;
        this.numberOfPTO = numberOfPTO;

    }

    @Override
    public String toString() {
        return "New Offer for James Bond{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", fullTime=" + fullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }

//    public static void main(String[] args) {
//        Offer offerFor = new Offer("NewYork","Google",155000,true,30);
//
//        System.out.println(offerFor);
//        System.out.println(offerFor.salary);
//
//
//
//    }
}
