package test;

import main.model.Transaction;
import main.service.AccountServiceImpl;
import main.service.TransactionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceImplTest {
    TransactionServiceImpl transactionService;

    @BeforeEach
    void setUp(){
        transactionService = new TransactionServiceImpl();
    }

    @Test
    @DisplayName("Test - statement print")
    void getTransactionsByAccountId() {
        //given -
        long accountId = 101;
        //when -
        List<Transaction>transactions = transactionService.getTransactionsByAccountId(accountId);
        //then -
        assertEquals(0, transactions.size());
    }
}