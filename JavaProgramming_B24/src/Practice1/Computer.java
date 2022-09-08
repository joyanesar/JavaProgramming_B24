package Practice1;

public class Computer {
    public static void main(String[] args) {

        String brand            = "Hp";
        String processor        = "Cori-5";
        byte   ram              =  12;
        byte   memory           =  32;
        int    storage          =  540;
        boolean hasMonitor      =  false;
        boolean hasWifi         =  true;
        String  description     =  "CanDoMultiTask";
        double  price           =  840.99;
        boolean cpu             =  true;
        int     numberOfMonitor = 2;
        byte     numberOfUsb    = 4;
        boolean hasUsb          = true;

        System.out.println("Information for "+brand + "computer");
        System.out.println("Processor type is " +processor + "and it has " +ram +"ram and " + memory);
        System.out.println("Storage size is " + storage + "No monitor " + hasMonitor);
        System.out.println("Has wifi " + hasWifi + " it can do " + description);
        System.out.println("The price is $" + price +"contain cpu " + cpu);
        System.out.println("Number of monitors " + numberOfMonitor + " Number of usb " + numberOfUsb + " it has usb " + hasUsb);
        }
    }

