package activities;

import examples.Bankaccount_act;
import examples.NotEnoughFundsException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class Activity2 {

        @Test
        void notEnoughFunds() {
            // Create an object for BankAccount class
            Bankaccount_act account = new Bankaccount_act(9);

            // Assertion for exception
            assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                    "Balance must be greater than amount of withdrawal");
        }

        @Test
        void enoughFunds() {
            // Create an object for BankAccount class
            Bankaccount_act account = new Bankaccount_act(100);

            // Assertion for no exceptions
            assertDoesNotThrow(() -> account.withdraw(10));
        }
    }

