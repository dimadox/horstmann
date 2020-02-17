package chapter21_internet_networking.Bank;

import chapter20_multithreading.test.BankAccount;

public class Bank {

    //������ �� �������� BankAccount
    private BankAccount[] accounts;

    //�������������� ������ ������ BankAccount
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
        account.deposit(amount);
    }

    public double getBalance(int accountNumber){
        BankAccount account = accounts[accountNumber];
        return account.getBalance();
    }



}
