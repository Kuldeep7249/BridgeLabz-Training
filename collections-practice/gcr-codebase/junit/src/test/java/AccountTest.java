import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.Account;
public class AccountTest {

    private Account account;   

    @BeforeEach
    void setup() {
        account = new Account(100); 
    }
     @Test
    public void Test_Deposit_ValidAmount() {
        account.deposit(500);

        assertEquals(600, account.getBalance());
    }

    @Test
    public void Test_Deposit_NegativeAmount() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-200);
        });

        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    public void Test_Withdraw_ValidAmount() {

        account.withdraw(30);

        assertEquals(70, account.getBalance());
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1000);
        });

        assertEquals("Insufficient funds", exception.getMessage());
    }
}
