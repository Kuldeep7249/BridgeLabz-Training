import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.BankAccount;
class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertTrue(account.withdraw(400));
        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawFailure() {
        BankAccount account = new BankAccount();
        account.deposit(300);
        assertFalse(account.withdraw(500));
        assertEquals(300, account.getBalance());
    }
}
