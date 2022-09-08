package day30_Arrays;

public class FirstAndLat_Letter {
    public static void main(String[] args) {
        String[] country = {
                "  Brazil   ", "China", "Cuba",
                "Sweden", "France", "Vietnam",
                "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Philippines",
                "China", "Philippines", "China",
                "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras",
                "Indonesia", "Brazil", "China",
                "United States", "Russia"};


        for (int i = 0; i < country.length; i++) {
            String each = country[i].toUpperCase().trim();

            System.out.println("Name of Country " + each);
            System.out.println("First letter is: " + each.charAt(0));
            System.out.println("Last letter is: " + each.charAt(each.length() - 1));

            System.out.println();
        }
            //for each loop
            for (String each : country) {
                each = each.toUpperCase();
                System.out.println("Name of Country " + each);
                System.out.println("First letter is: " + each.charAt(0));
                System.out.println("Last letter is: " + each.charAt(each.length() - 1));

                System.out.println();


            }


        }
    }
