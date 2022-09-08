package day48_static;

public class MoreChaining {
    public MoreChaining() {
        System.out.println("First");
    }

    public MoreChaining(int i) {
        //MoreChaining () ; we cannot use the name to call another constructor , we would use this();

        this();
    }

    public MoreChaining(String s) {
        this(5);
        System.out.println("String one");
        //this(5); any this() call needs to be the first line always
    }

    public MoreChaining(double d) {
        //this(10);
        this("java");
    }

//    public MoreChaining(char c){
//        this(c); its not possible to call itself

//    public MoreChaining(float f) {
//        this(true);
//    }
//    public MoreChaining(boolean b) {
//        this(4.8);
   // }  above is invalid because the float const called the boolean const which calls the float constructor, etc ;
}

