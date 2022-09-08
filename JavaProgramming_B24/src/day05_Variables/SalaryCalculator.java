package day05_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        double     salary         = 100000;
        double   stateTaxRate     =  0.08;
        double   federalTaxRate   = 0.21;

        double stateTax,federalTax,totalTax,salaryAfterTax;

        stateTax   = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax   = stateTax + federalTax;
        salaryAfterTax = salary-totalTax;

        System.out.println("With these values  salary ");
        System.out.println("Salary :" + salary);
        System.out.println("State tax rate " + stateTaxRate);
        System.out.println("Federal tax rate" + federalTaxRate);

        System.out.println("Total tax amount were");
        System.out.println("The state tax :" + stateTax);
        System.out.println("The FederalTax "+federalTax);
        System.out.println("Total tax "+ totalTax);
        System.out.println("Salary after tax  $" + salaryAfterTax);

    }
}
