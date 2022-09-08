package day34_Methods;

public class GetCharacters {
    /*


     */

    public static void printAtoZInUppercase() { // Prints all uppercase letters from a to z
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");  // its  like casting change int to char
        }
        System.out.println();
    }

    // print all the lowercase letter from a to z
    public static void printSmallLetters() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " ");

        }
        System.out.println();
    }

    // this will print zero to nine 9
    public static void printZeroToNine() {
        for (int i = '0'; i <= '9'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    //this will print letters Z to A uppercase

    public static void printZtoAUppercase() {
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();

    }

    // this method print lowercase letter form a to z
    public static void printLowercaseLetters() {
        for (int i = 'z'; i >= 'a'; i--) {

            System.out.print((char) i + " ");
        }
        System.out.println();


    }
}


