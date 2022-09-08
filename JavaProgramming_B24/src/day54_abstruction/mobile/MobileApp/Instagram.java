package day54_abstruction.mobile.MobileApp;

public class Instagram extends MobileApp {

    public void postPhoto(){
        System.out.println("Posting photo");
    }
    @Override
    public void useApp(int minutes){
        super.useApp(minutes);
        postPhoto();
    }

}
/*
instance method with are in the method

what do we inherit the variables are not inherited
all the public methods
getters and setters
 */