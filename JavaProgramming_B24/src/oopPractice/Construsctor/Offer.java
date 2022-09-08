package oopPractice.Construsctor;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer(String company , double salary) {
        this.company =company;
        this.salary = salary;
    }
    public Offer(boolean isFullTime , int numberOfPTO){


        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;

    }
    public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }


    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }


}
