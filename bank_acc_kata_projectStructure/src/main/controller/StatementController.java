package main.controller;

import main.model.Transaction;
import main.service.TransactionService;

import java.util.List;

public class StatementController {

    private final TransactionService transactionService;

    public StatementController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    /**
     * Controller method to get account statement
     * @param accountId
     * */
    public List<Transaction>getAllTransactionByAccount(long accountId){
        return transactionService.getTransactionsByAccountId(accountId);
    }
}
