package lv.rcs.lesson12.exercise2;

//2. create a class "BankAccount" with property "balance" (should be decimal number)
//    * create empty default constructor for it
//    * create a constructor with parameter for setting balance.
//    * create a method "deposit" with one parameter "amount" (decimal number) which allows user
//    * to increase his balance.
//    * create a method "withdraw" with one parameter "amount" (decimal number) which allows user
//    * to decrease his balance.
//    * create a method "printBalance" which displays the current balance to user
//    * method for transfer balance from one bank account to another
//    * override method equals
public class Lesson12Task2 {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(50);
        account1.checkBalance();
        account1.deposit(100);
        account1.checkBalance();
        account1.deposit(-100);
        account1.checkBalance();
        account1.deposit(10000);
        account1.checkBalance();
        // account1.balance = 1000000;
        //System.out.println(account1.balance);


//        BankAccount account2 = new BankAccount(100);
//        account2.checkBalance();
        //System.out.println(account2.balance);

    }
}
