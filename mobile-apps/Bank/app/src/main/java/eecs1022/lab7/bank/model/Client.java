package eecs1022.lab7.bank.model;

import android.annotation.SuppressLint;

public class Client {
    double balance;
    String name;
    String status;
    String [] statement;
    int nos;

    public Client(String name, double balance){
        this.balance = balance;
        this.name = name;
        this.nos += 1;
        this.status = String.format("%s: $%.2f", name, balance);
        String newStatus = String.format("%s: $%.2f", this.name, this.balance);
        this.statement = new String[this.nos];
        this.statement[0] = newStatus;


    }

    public String getStatus(){
        this.status = String.format("%s: $%.2f", this.name, this.balance);
        return status;
    }

    public String[] getStatement(){
        return this.statement;
    }

    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
        this.nos += 1;
        this.status = String.format("Transaction DEPOSIT: $%.2f", deposit);
        String newStatus = String.format("Transaction DEPOSIT: $%.2f", deposit);
        String [] newList = new String[this.nos];
        for(int i = 0; i < this.nos - 1; i++){
            newList[i] = this.statement[i];
        }
        newList[0] = getStatus();
        newList[this.nos - 1] = newStatus;
        this.statement = newList;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw;
        this.nos += 1;
        this.status = String.format("Transaction WITHDRAW: $%.2f", withdraw);
        String newStatus = String.format("Transaction WITHDRAW: $%.2f", withdraw);
        String [] newList = new String[this.nos];
        for(int i = 0; i < this.nos - 1; i++){
            newList[i] = this.statement[i];
        }
        newList[this.nos - 1] = newStatus;
        newList[0] = getStatus();
        this.statement = newList;

    }
}
