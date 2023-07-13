package test;

import main.model.Account;
import main.service.AccountServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceImplTest {

    AccountServiceImpl accountService;

    @BeforeEach
    void setUp(){
        accountService = new AccountServiceImpl();
    }

    @Test
    @DisplayName("Test - deposit")
    void deposit() {
        // given -
        BigDecimal amount = new BigDecimal(30);
        long accountId = 101;
        // when -
        String result = accountService.deposit(amount, accountId);
        // then-
        assertEquals(amount + " " + "added into your account", result);

    }

    @Test
    @DisplayName("Test - withdraw")
    void withdraw() {
        // given -
        BigDecimal amount = new BigDecimal(50);
        long accountId = 101;
        // when -
        String result = accountService.withdraw(amount, accountId);
        // then-
        assertEquals(amount + " " + "withdrawn from your account", result);
    }

    @Test
    @DisplayName("Test - getAccount")
    void getAccount() {
        // given -
        long accountId = 101;
        // when -
        Account result = accountService.getAccount(accountId);
        // then-
        assertNotNull(result);

   }
}