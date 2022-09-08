package officeHour;

import day53_Inheritance.Rules.C;

public class Jacket extends Clothes implements  HasHood{
    @Override
    public void wear() {
        System.out.println("Putting on jacket");

    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on hood");

    }
}
