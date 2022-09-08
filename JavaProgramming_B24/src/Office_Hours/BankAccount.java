package Office_Hours;
public class BankAccount {

    String fullName;
    double balance;
    long accountNumber;
    String accountType;

    public BankAccount(String name, double currentBalance, long accNum , String accType ){
        fullName = name;
        balance = currentBalance;
        accountNumber = accNum;
        accountType = accType;

    }
    public double checkBalance(){
        return balance;

    }
    public double deposit(double money){

        balance += money;
        return  balance;

   }
   public double withdraw(double cashOut){

        if(cashOut > 0 && balance >= cashOut){
            balance -= cashOut;
        }

        return  balance;
   }

    @Override
    public String toString() {
        return "BankAccount Holder{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
