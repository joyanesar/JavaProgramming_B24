package day54_abstruction.mobile.MobileApp;

public class Discord  extends MobileApp{

    public void chat(){
        System.out.println("chating on " + getName());

    }

    // chat method is like post photo method in instagram just an extra instance method unique to theo child class
    @Override
    public void useApp(int minutes){

        super.useApp(minutes);
        chat();
    }
}
