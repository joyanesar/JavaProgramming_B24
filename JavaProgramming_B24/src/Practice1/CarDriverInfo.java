package Practice1;

public class CarDriverInfo {
    public static void main(String[] args) {

        String carModel ;
        String driverName ;
        int    licenseNum ;
        short  speed;
        boolean isAutomatic;
        char    licenseClass;

        carModel       = "BMW";
        driverName     = "Joya";
        licenseNum     = 123456;
        speed          = 260;
        isAutomatic    = true;
        licenseClass   = 'A';
        System.out.println("My name is " + driverName + " I have " + carModel);
        System.out.println("It is " +isAutomatic );
        System.out.println("My licensesNumber is :" +licenseNum);
        System.out.println("It can runs up to " + speed + " perMiles");
        System.out.println("licensesClass Tpe is :" + licenseClass);


    }
}
