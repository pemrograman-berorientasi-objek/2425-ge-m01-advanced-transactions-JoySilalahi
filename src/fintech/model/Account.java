package fintech.model;

import java.util.*;

//12S23007 - Joy Silalahi
//12S23020 - Rachel Simorangkir

public class Account {
    private String username;
    private String name;
    private double balance;
    private List<Transaction> transactions;

    public Account(String name, String username) {
        this.name = name;
        this.username = username;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        if (balance + transaction.getAmount() >= 0) {
            transactions.add(transaction);
            balance += transaction.getAmount();
        }
    }

    public void showAccount() {
        System.out.println(username + "|" + name + "|" + balance);
        for (Transaction t : transactions) {
            System.out.println(t);
        }
        
    }
}