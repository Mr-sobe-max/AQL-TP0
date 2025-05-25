package EXOBONUS1;

import org.example.com.EXOBONUS1.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0, 0.05);
    }

    @Test
    void depositShouldIncreaseBalance() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    void depositShouldThrowExceptionForNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }

    @Test
    void depositShouldHandleZeroAmount() {
        account.deposit(0.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawShouldThrowExceptionForNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10.0));
    }

    @Test
    void withdrawShouldThrowExceptionForInsufficientBalance() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(150.0));
    }

    @Test
    void transferShouldMoveAmountBetweenAccounts() {
        BankAccount other = new BankAccount(50.0, 0.05);
        account.transfer(30.0, other);
        assertEquals(70.0, account.getBalance(), 0.001);
        assertEquals(80.0, other.getBalance(), 0.001);
    }

    @Test
    void transferShouldThrowExceptionForNullAccount() {
        assertThrows(NullPointerException.class, () -> account.transfer(30.0, null));
    }

    @Test
    void addInterestShouldIncreaseBalance() {
        account.addInterest();
        assertEquals(105.0, account.getBalance(), 0.001);
    }

    @Test
    void addInterestShouldHandleNegativeRate() {
        BankAccount negativeRateAccount = new BankAccount(100.0, -0.05);
        negativeRateAccount.addInterest();
        assertEquals(95.0, negativeRateAccount.getBalance(), 0.001);
    }

    @Test
    void constructorShouldThrowExceptionForNegativeBalance() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(-100.0, 0.05));
    }
}
