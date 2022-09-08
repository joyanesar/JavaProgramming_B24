package oopPractice.Construsctor;

public class Carpet {

    double width;
    double length;
    double    unitPrice;
    boolean isPersian;
    double totalPrice;
    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian) {
       width = inputWidth;
       length = inputWidth;
       unitPrice = inputUnitPrice;
       isPersian = inputIsPersian;


        totalPrice = width * length * unitPrice;
        if(isPersian){
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return "'\n'Carpet{" +
                "'\n'width=" + width +
                "'\n'length=" + length +
                "'\n' unitPrice=" + unitPrice +
                " '\n'isPersian=" + isPersian +
                " '\n'totalPrice=" + totalPrice +
                '}';
    }
}
