package oopPractice.Construsctor;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingEmployee {
    public static void main(String[] args) {

        Employee obj = new Employee("James",007,"supervisor",150_000);

       // obj.getReadyForClass();
        //System.out.println(obj);

        Employee obj1 = new Employee("Nadir",8007,"instructor",195_000);

        obj1.getReadyForClass();
        System.out.println(obj1);

        Employee [] staff = new Employee[3];
        staff [0] = obj;
        staff [1] = obj1;
        staff [2] = new Employee("Muradil",2002,"Automator",199_000);
        //staff [3] = new Employee("Arment",3002,"student",1000);

        System.out.println(Arrays.toString(staff));

        Employee[] updatedStaff = new Employee[6];
        updatedStaff[0] = obj;
        updatedStaff[1] = obj1;
        updatedStaff[2] = new Employee("nadir",3114,"teacher",16412);
        updatedStaff[3] = new Employee("bakir",1132,"sddet",1324);
        updatedStaff[4] = new Employee("kedir",454,"engiener",13246);
        updatedStaff[5] = new Employee("nisso", 4542,"sdet",7642);
        System.out.println(Arrays.toString(updatedStaff));





    }
}
