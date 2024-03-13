package org.example;

public class Transaction {
    public static boolean transferAmount(Account sender, Account receiver, double amount) {
        if (sender.getBalance() >= amount) {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
            return true;
        } else {
            return false;
        }
    }
}
