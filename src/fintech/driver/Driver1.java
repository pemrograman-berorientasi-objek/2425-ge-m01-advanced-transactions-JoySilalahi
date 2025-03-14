package fintech.driver;

import java.util.*;
import fintech.model.Account;
import fintech.model.Transaction;

// Joy Silalahi - 12S23007
// Rachel Simorangkir - 12S23020

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Account> accounts = new TreeMap<>();
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("---")) break;
            
            String[] parts = input.split("#");
            switch (parts[0]) {
                case "create-account":
                    String name = parts[1];
                    String username = parts[2];
                    accounts.put(username, new Account(name, username));
                    break;
                case "create-transaction":
                    String user = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    String timestamp = parts[3];
                    String description = parts[4];
                    if (accounts.containsKey(user)) {
                        accounts.get(user).addTransaction(new Transaction(user, amount, timestamp, description));
                    }
                    break;
                case "show-account":
                    String accountUser = parts[1];
                    if (accounts.containsKey(accountUser)) {
                        accounts.get(accountUser).showAccount();
                    }
                    break;
            }
        }
        
        for (Account account : accounts.values()) {
            account.showAccount();
        }
        
        scanner.close();
    }
}