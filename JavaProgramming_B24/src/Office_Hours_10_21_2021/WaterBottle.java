package Office_Hours_10_21_2021;

public class WaterBottle {
    private String  brand;
    private  double ounces;

    /*
    Create a class called WaterBottle
- instance variables: brand, ounces

- Create a constructor to initialize the two fields

- Encapsulate the variables

- Bonus: prevent negative ounces to be assigned and null or empty space to be assigned to brand
     */

    public WaterBottle(String brand, double ounces) {
        this.brand = brand;
        this.ounces = ounces;
    }

    public String getBrand(){

        return  brand;
    }

    public void  setBrand(String brand){
        if(brand != null && !brand.isEmpty()){
            this.brand = brand;

        }

    }
    public  double getOunces(){
        return ounces;


    }
    public void setOunces(double ounces){
        if(ounces > 0 && ounces < 0){
            this.ounces = ounces;

        }
    }

}
