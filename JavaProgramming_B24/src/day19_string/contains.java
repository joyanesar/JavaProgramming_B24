package day19_string;

public class contains {
    public static void main(String[] args) {


        String name = "mr james";
        System.out.println(name.contains("mr") || name.contains("mrs"));
        System.out.println(name.contains("jr"));

        String address = "2400 2nd street";
        System.out.println(address.contains("2400") || address.equals("street"));

        String moon = "book";
        System.out.println(moon.indexOf("book"));


        System.out.println(moon.contains("o"));
        System.out.println(moon.contains("k"));

        System.out.println(moon.indexOf("b"));
        System.out.println(moon.indexOf("o"));
        System.out.println(moon.charAt(3));
        System.out.println(moon.charAt(2));
    }

}
