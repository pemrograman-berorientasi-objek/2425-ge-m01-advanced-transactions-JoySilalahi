package fintech.model;

//12S23007 - Joy Silalahi
//12S23020 - Rachel Simorangkir

public class Transaction {

    private static int counter = 0;
    private int id;
    private String username;
    private double amount;
    private String timestamp;
    private String description;

    public Transaction(String username, double amount, String timestamp, String description) {
        this.id = ++counter;
        this.username = username;
        this.amount = amount;
        this.timestamp = timestamp;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return id + "|" + username + "|" + amount + "|" + timestamp + "|" + description;
    }
}