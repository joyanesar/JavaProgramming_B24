package day30_Arrays;

public class MiddlerCountries {
    public static void main(String[] args) {

        String [] countries = {
        "  Brazil   ", "China", "Cuba",
                "Sweden", "France", "Vietnam",
                "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Philippines",
                "China", "Philippines", "China",
                "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras",
                "Indonesia", "Brazil", "China",
                "United States", "Russia"};

        for (String country:countries){
            int mid = country.length()/2;

            if(country.length() % 2 == 0){
                //two middle char

                System.out.println(country.substring(mid -1,mid + 1));
//                System.out.println(country.charAt(mid - 1) + " " + country.charAt(mid));

            }else {
                //one middle char
                System.out.println(country.charAt(mid));

            }
        }
       // for(int i=0;i<countries.length;i+++){

        }
    }

