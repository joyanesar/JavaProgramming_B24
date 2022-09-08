package day58_exceptions.item;

public class Store {
    public static void main(String[] args) {


        Eragon obj1 = new Eragon(); //itself

        Book obj2 = new Eragon(); // Parent

        Item obj3 = new Eragon(); // Paren

        // also have interface for  reference

        obj1.Use();
        obj2.Use();
        obj3.Use();

       // new Book("").Use();
        obj1.sell();
        ((Eragon) obj2).sell();
        //((Eragon)obj3).sell();
        Eragon newObj = (Eragon) obj3;
        newObj.sell();
        /*
        long l = 100l;
        byte b = (byte)l;



         */
        purchase((new Item("Wooden spoon")));
        purchase(obj1);
        purchase(new Book("Harry Potter"));
    }

    public static void purchase(Item item){
        System.out.println("Purchasing " + item.name);
    }
}
