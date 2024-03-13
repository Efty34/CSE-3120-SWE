package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    private Account account1 = new Account(1, 15000);
    private Account account2 = new Account(2, 10000);

    @Test
    void transferAmount() {
        boolean canTransfer = Transaction.transferAmount(account1, account2, 12000);
        assertTrue(canTransfer);
    }

    @Test
    void transferAmountFail() {
        boolean canTransfer = Transaction.transferAmount(account1, account2, 20000);
        assertFalse(canTransfer);
    }
}