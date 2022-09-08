package Office_Hours;

public class Title_practic {
    public static void main(String[] args) {
          /*

    Mr

    Mrs

    Dr

    Senior  - Sr

    Madam

    Junior  - Jr

     */

            String name = "Mr Dr James Jr";

            if (name.startsWith("Mr")) {
                System.out.println("Hell Mr");

            } else if (name.startsWith("Mrs")) {
                System.out.println("Hell Miss");

            } else if (name.startsWith("Dr")) {
                System.out.println("Hello doctor, are you study java?");

            } else if (name.startsWith("Madam")) {
                System.out.println("Hello Madam");
            }

            if (name.endsWith("Jr")) {
                System.out.println("Hell Junior");

            } else if (name.endsWith("Senior")) {
                System.out.println("Hello Senior");
            }
        }
    }
