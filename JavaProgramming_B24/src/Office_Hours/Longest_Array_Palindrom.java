package Office_Hours;

public class Longest_Array_Palindrom {
    public static void main(String[] args) {
        /*
        Given a String array. Find the longest Palindrome String in your array.
Ex:
Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
         */
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String  longest = " ";

        for(String eachWords: words){
            System.out.println(eachWords);

            boolean isPalindrome = true;

            for (int i=0; i < eachWords.length() / 2; i++){

                if(eachWords.charAt(i) == eachWords.charAt(eachWords.length()-1 -i)){
                    isPalindrome = false;
                    break;
                }
                /*
                the length -1 - i
                part allow you to red the characters from the end in the same number of iteration that i goes forwards
                intstead of this approach you could have also made another variable that starts from the last index and decrement every time.

                 */
            }
            if(isPalindrome && eachWords.length() > longest.length()){
                longest = eachWords;
            }
        }
        System.out.println("Longest " + (longest.isEmpty()? "No palindrome " : longest));
    }
}
