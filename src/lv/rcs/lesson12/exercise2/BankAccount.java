package lv.rcs.lesson12.exercise2;

class BankAccount {

    private double balance;

    BankAccount() {
    }

    BankAccount(double newBalance) {
        balance = newBalance;
    }

    void deposit(double amount) {
        if (amount > 0 && amount < 1000) {
            balance += amount;
//        balance = balance + amount;
        } else {
            System.out.println("invalid amount: " + amount);
        }
    }

    void checkBalance() {
        System.out.println(balance);
    }

}
