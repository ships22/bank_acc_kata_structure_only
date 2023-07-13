package main.service;

import main.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionServiceImpl implements TransactionService{

    /**
     * get transaction details of an account
     * @param accountId
     * */
    @Override
    public List<Transaction> getTransactionsByAccountId(long accountId) {
        // get transaction list from the repository
        return new ArrayList<Transaction>();
    }
}
