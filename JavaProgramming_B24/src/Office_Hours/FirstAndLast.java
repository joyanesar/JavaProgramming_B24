package Office_Hours;

public class FirstAndLast {
    public static void main(String[] args) {
        /*
        given a string array

        first and last letter of each element
         */

        String [] arr = {"apple", "tree", "shed", "marker", "pen"};

        for(String each: arr){

            System.out.println("First letter of " + each.charAt(0));
           System.out.println("Last letter of " + each.charAt(each.length() -1));
           // System.out.println(each.substring(each.length()-1));

        }
        System.out.println();
    }
}
