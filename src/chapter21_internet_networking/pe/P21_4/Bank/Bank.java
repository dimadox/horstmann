package chapter21_internet_networking.pe.P21_4.Bank;

import chapter20_multithreading.test.BankAccount;

public class Bank {

    //массив из объектов BankAccount
    private BankAccount[] accounts;

    //инициализируем каждый объект BankAccount
    public Bank(int size){
        accounts = new BankAccount[size];
        for (int i=0; i<accounts.length; i++){
            accounts[i] = new BankAccount();
        }
    }



    public void deposit(int accountNumber, double amount){
        BankAccount account = accounts[accountNumber];
        account.deposit(amount);
    }

    public void withdraw(int accountNumber, double amount){
        BankAccount account = accounts[accountNumber];
        account.withdraw(amount);
    }

    public double getBalance(int accountNumber){
        BankAccount account = accounts[accountNumber];
        return account.getBalance();
    }



}
