package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Bank ucBank;

    @BeforeEach
    public void setUp(){
        ucBank = new Bank("UcBank", 10);
    }
    
    @Test
    public void createBankTest() {
        assertNotNull(ucBank);
        assertEquals("UcBank", ucBank.getName());
        assertEquals(10, ucBank.getMaximumNoOfCustomer());
    }

    @Test
    public void bankCanCreateAccountTest(){
        ucBank.createAccountFor("Otu","Uchechi", "0123");
        ucBank.createAccountFor("Saheed","Osupa", "1234");
        assertEquals(2, ucBank.getNumberOfCustomers());
    }

    @Test
    public void createAccountCheckForCustomerByAccountTest(){
        ucBank.createAccountFor("Otu","Uchechi", "1234");
        ucBank.createAccountFor("Seyi","Banjo", "1234");
        ucBank.createAccountFor("Tola","Ruth", "1234");
        ucBank.createAccountFor("Foal","Mic", "1234");
        ucBank.createAccountFor("Taiwo","Taye", "1234");
        assertEquals(5, ucBank.getNumberOfCustomers());

        Account account = ucBank.findAccount(2);
        assertEquals("Banjo Seyi",account.getAccountName());
        assertEquals("2", account.getAccountNumber());
    }

    @Test
    public void bankCanDepositMoneyTest(){
        ucBank.createAccountFor("Saheed","Osupa", "1234");
        ucBank.deposit(1200,"1");
        ucBank.deposit(1800,"1");

        Account account = ucBank.findAccount(1);
        assertEquals(3000, account.getBalance("1234"));

    }

    @Test
    public void bankCanWithdrawMoneyTest(){
        ucBank.createAccountFor("Saheed","Osupa", "1234");
        ucBank.deposit(1200,"1");
        ucBank.withdraw(1000,"1", "1234");

        Account account = ucBank.findAccount(1);
        assertEquals(200, account.getBalance("1234"));

    }

    @Test
    public void bankCanTransferMoneyTest() {
        ucBank.createAccountFor("Saheed","Osupa", "1234");
        ucBank.createAccountFor("Seyi","Banjo", "1234");

//        gtBank.deposit();

        Account account = ucBank.findAccount(1234);
//        assertEquals(12000, account.getBalance());

//        gtBank.transfer();
    }
}
