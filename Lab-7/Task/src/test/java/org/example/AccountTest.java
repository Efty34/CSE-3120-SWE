package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;
    @Test
    void getAccountNumber() {
        account = new Account(1,3000);
        int id = account.getAccountNumber();
        assertEquals(id,1);
    }

    @Test
    void getBalance() {
        account = new Account(1,3000);
        double balance = account.getBalance();
        assertEquals(balance,3000);
    }

    @Test
    void setBalance() {
        account = new Account(1,3000);
        account.setBalance(4000);
        assertEquals(account.getBalance(),4000);
    }
}