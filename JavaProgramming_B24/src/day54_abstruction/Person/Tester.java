package day54_abstruction.Person;

public class Tester  extends Employee{


    @Override
    public void work() {
        System.out.println("Run Test Cases");

    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Sleeping " + minutes + " while tests run automatically");

    }
}
/*  concrete is first none abstract class this class must implement all abstract methods
Make Child classes of Employee and implements methods:

        Tester, Developer, Chef, Server
 */