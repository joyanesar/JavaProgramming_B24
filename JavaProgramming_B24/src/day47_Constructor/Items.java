package day47_Constructor;
public class Items {
    String name;
    int quantity;
    double unitPrice;
    double totalCost;

    public Items(String name, int quantity, double unitPrice) {

        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();

    }
    public void calculatePrice(){
        totalCost = quantity * unitPrice;


}

public String toString() {
    return "Item:" + name + " Quantity: " + quantity + " | Total price " + totalCost;
}
}

//    @Override
//    public String toString() {
//        return "Items{" +
//                "name='" + name + '\'' +
//                ", quantity=" + quantity +
//                ", unitPrice=" + unitPrice +
//                ", totalCost=" + totalCost +
//                '}';
//    }
//
//    public static void main(String[] args) {
//
//
//       Items list = new Items("Burger",100,4.75);
//
//        System.out.println(list);
//
//
//    }


