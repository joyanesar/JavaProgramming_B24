package day39_wrapper_arraylist;

public class Boxing {
    public static void main(String[] args) {

        int i  = 100;
        Integer i2 = i;
        System.out.println(i2);
        /*
        i is a primitive type
        we store i into i2 which is wrapper class

        primitive type - > wrapper class object
        Autoboxing
         */
        Integer i3 = 600; // autoboxing it automatically converted for int to
        // wrapper class

        int z = i3 ;  // unboxing. It goes from wrapper class object to
        //primitive type
        System.out.println(z);

        int x = new Integer(40);// unboxing
        System.out.println(x);

        double a = 10.5;
        int b = (int)a;
        System.out.println(b);

    }
}
