package eecs1022.lab7.bank.model;

public class Transaction {
    String status;

    public Transaction(String action, double amount){
    status = String.format("Transaction %s: $%.2f", action, amount);
    }

    public String getStatus(){
        return status;
    }
}
