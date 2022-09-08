package day45_Constructor;

public class Item {

    String name;
    double price;


    @Override
    public String toString() {  // Right click in the class and find Generate and enter and select toString give u this.
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
