package main.service;

import main.model.Transaction;

import java.util.List;

public interface TransactionService {
    /**
     * get transaction details of an account
     * @param accountId
     * */
    public List<Transaction>getTransactionsByAccountId(long accountId);
}
