package day60_collections;

public class Bank {
    /*
    Bank

    balance

    widthraw(double money)

        invalid cases:
        -> money >= balance  -> cause exception
        -> balance < 0       -> cause exception

        valid case:
            "Withdraw " + money

    hint: throw new IllegalArgumentException
     */

    double balance;
    public void  withdraw(double money) {
        if (balance <= 0) {
            throw new NotEnoughMoneyException();

    }else if (money > balance){
            throw  new  IllegalArgumentException();
        }
        System.out.println("Withdraw $ " + money);
        balance -= money;
    }


}
