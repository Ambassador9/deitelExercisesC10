package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(100);
        //assert
        assertEquals(100, ucheAccount.getBalance());

    }

    @Test
    public void depositMultipleTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(100);
        ucheAccount.deposit(500);
        ucheAccount.deposit(600);
        //assert
        assertEquals(1200, ucheAccount.getBalance());

    }

    @Test
    public void negativeDepositTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(1000);
        ucheAccount.deposit(-400);
        //assert
        assertEquals(1000, ucheAccount.getBalance());
    }

    @Test
    public void withdrawalTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(4000);
        ucheAccount.withdraw(2000);
        //ucheAccount.withdraw(350);
        //assert
        assertEquals(2000, ucheAccount.getWithdrawBalance());
    }

    @Test
    public void emptyWithdrawalTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(0);
        ucheAccount.withdraw(2000);
        //ucheAccount.withdraw(350);
        //assert
        assertEquals(0, ucheAccount.getWithdrawBalance());
    }

    @Test
    public void aboveWithdrawalTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(1000);
        ucheAccount.withdraw(2000);
        //ucheAccount.withdraw(350);
        //assert
        assertEquals(0, ucheAccount.getWithdrawBalance());
    }
}
