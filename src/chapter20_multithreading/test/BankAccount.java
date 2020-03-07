package chapter20_multithreading.test;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(int balance){
        this.balance = balance;
    }



    //внесение
    public void deposit(double amount){
        System.out.println("Depositing " + amount);
        double newBalance = balance + amount;
        System.out.println("new balance is " + newBalance);
        balance = newBalance;
    }

    //снятие
    public void withdraw(double amount){
        System.out.println("Withdrawing " + amount);
        double newBalance = balance - amount;
        System.out.println("new balance is " + newBalance);
        balance = newBalance;
    }

    //получение баланса
    public double getBalance(){
        return balance;
    }

}
