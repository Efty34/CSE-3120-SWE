package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTestIT {

    @Test
    void testAccountTransactionIntegration() {
        Account account1 = new Account(1, 15000);
        Account account2 = new Account(2, 10000);
        boolean transferAmountSuccess = Transaction.transferAmount(account1, account2, 12000);
        if (transferAmountSuccess) {
            assertEquals(3000, account1.getBalance(), 0.001);
            assertEquals(22000, account2.getBalance(), 0.001);
        } else {
            fail("Transaction failed");
        }
    }
}