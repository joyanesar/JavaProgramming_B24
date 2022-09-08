package Office_Hours;

public class Bank {
    public static void main(String[] args) {


        BankAccount account = new BankAccount("Jame Bond",2000,1234567L,"Checking");


        System.out.println(account);
        System.out.println(account.checkBalance());
        account.withdraw(500);
        System.out.println(account.balance);
        account.deposit(1500);
        System.out.println(account.balance);
        account.withdraw(4000);
        System.out.println(account.balance);
        System.out.println(account.deposit(9000));






    }

}
