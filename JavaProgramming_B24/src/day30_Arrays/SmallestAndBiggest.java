package day30_Arrays;

public class SmallestAndBiggest {
    public static void main(String[] args) {

        String [] countries = {"  Brazil   ", "China", "Cuba",
                "Sweden", "France", "Vietnam",
                "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Philippines",
                "China", "Philippines", "China",
                "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras",
                "Indonesia", "Brazil", "China",
                "United States", "UAE" ,"Russia","Afghanistan"};


        String smallest =countries [0];
        String biggest = countries[0];

        for (String country:countries){

            if(country.length() < smallest.length()){
                smallest = country;


            }
             if(country.length() > biggest.length()){
                 biggest = country;
            }

        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Biggest: " + biggest);
    }
}
