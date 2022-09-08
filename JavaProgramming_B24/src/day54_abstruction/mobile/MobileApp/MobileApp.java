package day54_abstruction.mobile.MobileApp;

public class MobileApp {


    private String name;
    private  double version;

    public void download(){
        System.out.println("Downloading vesion " + version + " of " + name);
    }
    public void useApp(int minutes){  // This is method
        System.out.println("Using " + name + " for " + minutes + " minutes");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
/*
Task:

    create a class MobileApp

        instance variables:

            name, version

        instance method:

            useApp()

        encapsulate
 */