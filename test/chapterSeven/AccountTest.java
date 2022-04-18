package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void startEachWith(){
        account = new Account("0123456789", "Otu", "Uchechi", "0123");
    }

    @Test
    public void accountCanBeCreatedTest(){
        assertNotNull(account);
    }

    @Test
    public void accountCanBeCreatedWithAccountNumber(){
        assertEquals("0123456789", account.getAccountNumber());
    }

    @Test
    public void accountCanBeCreatedWithAccountName(){
        assertEquals("Otu"+" "+"Uchechi", account.getAccountName());
    }

    @Test
    public void accountCanBeCreatedWithAccountPin(){
        assertEquals("0123", account.getAccountPin());
    }

    @Test
    public void depositTest() {
        account.deposit(100);
        assertEquals(100, account.getBalance("0123"));
    }

    @Test
    public void doubleDepositTest() {
        account.deposit(100);
        account.deposit(500);
        assertEquals(600, account.getBalance("0123"));
    }

    @Test
    public void negativeDepositTest() {
        account.deposit(500);
        account.deposit(-200);
        assertEquals(500, account.getBalance("0123"));
    }

    @Test
    public void withdrawWithPin(){
        account.deposit(1000);
        account.withdraw(500, "0123");
        assertEquals(500,account.getBalance("0123"));
    }

    @Test
    public void doubleWithdrawWithPin(){
        account.deposit(1000);
        account.withdraw(500, "0123");
        account.withdraw(300, "0123");
        assertEquals(200,account.getBalance("0123"));
    }

    @Test
    public void withdrawWithWrongPin(){
        account.deposit(1000);
        account.withdraw(500, "0123");
        assertEquals(500,account.getBalance("0123"));
    }

    @Test
    public void negativeWithdrawWithPin(){
        account.deposit(1000);
        account.withdraw(1200, "0123");
        assertEquals(1000,account.getBalance("0123"));
    }
}
