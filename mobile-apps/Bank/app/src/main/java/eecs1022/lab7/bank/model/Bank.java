package eecs1022.lab7.bank.model;

import android.annotation.SuppressLint;

public class Bank {
    String status;
    Client [] clients;
    String statusString;
    int noc;

    public Bank(){
        this.status = "Accounts: {}";

    }

    public String getStatus(){
//        String status = "Accounts: {";
//
//        if(clients != null){
//            for(int i = 0; i <  clients.length -1 ; i++){
//                status += clients[i].getStatement()[0];
//            }
//            status += clients[clients.length - 1].getStatement()[0];
//            status += "}";
//            this.status = status;
//        }
        return this.status;
    }

    public String[] getStatement(String name){
        String [] statement = null;
        Boolean clientExists = false;
        if(clients != null){
            for(int i = 0; i < clients.length; i++){
                if(clients[i].getName().equals(name)){
                    clientExists = true;
                    statement =  clients[i].getStatement();
                }
            }
        }
        if(!clientExists){
            this.status = String.format("Error: From-Account %s does not exist", name);
        }


        return statement;
    }

    public void deposit(String name, double amount){
        if(clients != null){
            Boolean accountExists = false;
            for(int i = 0; i < clients.length; i++){
                if(clients[i].getName().equals(name)){
                    accountExists = true;
                }
            }
            if(!accountExists){
                this.status = String.format("Error: To-Account %s does not exist", name);
            }
            else{
                for(int i = 0; i < clients.length; i++){
                    if(clients[i].getName().equals(name)){
                        if(amount > 0){
                            clients[i].deposit(amount);
                            String status = "Accounts: {";
                            if(clients != null){
                                for(int j = 0; j <  clients.length -1 ; j++){
                                    status += clients[j].getStatement()[0] + ", ";
                                }
                                status += clients[clients.length - 1].getStatement()[0];
                                status += "}";
                                this.status = status;
                            }

                        }
                        else if(amount <= 0){
                            this.status = "Error: Non-Positive Amount";
                        }
                    }
                }
            }
        }
        else{
            this.status = String.format("Error: To-Account %s does not exist", name);
        }
    }

    public void withdraw(String name, double amount){
        if(clients != null){
            Boolean accountExists = false;
            for(int i = 0; i < clients.length; i++){
                if(clients[i].getName().equals(name)){
                    accountExists = true;
                    if(amount > 0 && clients[i].getBalance() > amount){
                        clients[i].withdraw(amount);
                        String status = "Accounts: {";
                        if(clients != null){
                            for(int j = 0; j <  clients.length -1 ; j++){
                                status += clients[j].getStatement()[0] + ", ";
                            }
                            status += clients[clients.length - 1].getStatement()[0];
                            status += "}";
                            this.status = status;
                        }
                    }
                    else if(amount <= 0){
                        this.status = "Error: Non-Positive Amount";
                    }
                    else if(clients[i].getBalance() < amount){
                        this.status = "Error: Amount too large to withdraw";
                    }

                }
            }
            if(!accountExists){
                this.status = String.format("Error: From-Account %s does not exist", name);
            }
        }
        else{
            this.status = String.format("Error: From-Account %s does not exist", name);
        }
    }

    public void transfer(String fromAccount, String toAccount, double amount){
        if(clients != null){
            Boolean fromAccountExists = false;
            Boolean toAccountExists = false;
            Boolean enoughToWithdraw = false;
            for(int i = 0; i < clients.length; i++) {
                if (clients[i].getName().equals(fromAccount)) {
                    fromAccountExists = true;
                    enoughToWithdraw = clients[i].getBalance() >= amount;
                }
                if (clients[i].getName().equals(toAccount)) {
                    toAccountExists = true;
                }
            }
            if(!fromAccountExists){
                this.status = String.format("Error: From-Account %s does not exist", fromAccount);
            }
            else if(!toAccountExists){
                this.status = String.format("Error: To-Account %s does not exist", toAccount);
            }
            else if(amount <= 0){
                this.status = "Error: Non-Positive Amount";
            }
            else if(!enoughToWithdraw){
                this.status = "Error: Amount too large to transfer";
            }
            else{
                for(int i = 0; i < clients.length; i++) {
                    if (clients[i].getName().equals(fromAccount)) {
                        clients[i].withdraw(amount);
                        String status = "Accounts: {";
                        if(clients != null){
                            for(int j = 0; j<  clients.length -1 ; j++){
                                status += clients[j].getStatement()[0] + ", ";
                            }
                            status += clients[clients.length - 1].getStatement()[0];
                            status += "}";
                            this.status = status;
                        }
                    }
                    if (clients[i].getName().equals(toAccount)) {
                        clients[i].deposit(amount);
                        String status = "Accounts: {";
                        if(clients != null){
                            for(int j = 0; j <  clients.length -1 ; j++){
                                status += clients[j].getStatement()[0] + ", ";
                            }
                            status += clients[clients.length - 1].getStatement()[0];
                            status += "}";
                            this.status = status;
                        }
                    }
                }
            }
        }
        else{
            this.status = String.format("Error: From-Account %s does not exist", fromAccount);
        }
    }

    public void addClient(String name, double bal){
        Boolean clientExists = false;
        if(clients != null) {
            for (int i = 0; i < clients.length; i++) {
                if (clients[i].getName().equals(name)) {
                    clientExists = true;
                }
            }
        }
        if(this.noc >= 6){
            this.status = "Error: Maximum Number of Accounts Reached";
        }
        else if(clientExists){
            this.status = String.format("Error: Client %s already exists", name);
        }
        else if(bal <= 0){
            this.status = "Error: Non-Positive Initial Balance";
        }
        else{
            this.status = String.format("Accounts: {%s: $%.2f}", name, bal);
            Client newClient = new Client(name,bal);
            this.noc += 1;
            Client [] newList = new Client [this.noc];
            for(int i = 0; clients != null && i < clients.length; i++) {
                newList[i] = clients[i];
                }
            newList[this.noc - 1] = newClient;
            this.clients = newList;
            String status = "Accounts: {";
            if(clients != null){
                for(int i = 0; i <  clients.length -1 ; i++){
                    status += clients[i].getStatement()[0] + ", ";
                }
                status += clients[clients.length - 1].getStatement()[0];
                status += "}";
                this.status = status;
            }
        }



    }



}
