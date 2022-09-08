package day39_wrapper_arraylist;

public class wrapper_Example_One {
    public static void main(String[] args) {

        int a = 5;
        //  you cannot use method from it. ex: method()
        // you can : print , assign/reassign, calculations, casting

        Integer i1 = new Integer(10);
        Integer i2 = 100; // this converts int primitive to Integer wrapper class
        Integer i3 = 200;
        System.out.println(i1);
        System.out.println(i2);

        byte b = 4;
        Byte b2 = new Byte((byte) 5);
        Byte b3 = (byte)500;
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);

        short s = 100;  // this primitive
        Short s2 = new Short((short) 200); // this is wrapper class
        Short s3 = 300; // this is already wrapper class

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

        long l = 1000l; // by adding l it will change from int to long type
        long l2 = new Long(2000l);
        long l3 = 3000L;
        System.out.println(l);
        System.out.println(l2);

        Float fl = new Float(4.5); //This is wrapper type
        Float f2 = 4.7F;






    }
}
