//package day48_static.Iphone;
//
//public class Iphone {
//    String model;
//    String color;
//    double price;
//    int storage;
//
//    static String brand;
//    static String OS;
//
//    static {
//        brand = "Apple";
//        OS = "IOS";
//    }
//
//    public IPhone(String model, double price) {
//        this.model = model;
//        this.price = price;
//    }
//
//    public IPhone(String model, String color, double price, int storage) {
//        this(model, price);
//        this.color = color;
//        this.storage = storage;
//    }
//
//    @Override
//    public String toString() {
//        return "IPhone{" +
//                "model='" + model + '\'' +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", storage=" + storage +
//                '}';
//    }
//}
//
//
