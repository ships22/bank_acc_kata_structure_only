package main.service;

import main.model.Account;

import java.math.BigDecimal;

public interface AccountService {
    /**
     * Get account from db / api / main.service
     * @param accountId
     * */
    public Account getAccount(long accountId);

    /**
     * Method to deposit in the selected account
     * @param amount
     * @param accountId
     * */
    public String deposit(BigDecimal amount, long accountId);

    /**
     * Method to withdraw from the selected account
     * @param amount
     * @param accountId
     * */
    public String withdraw(BigDecimal amount, long accountId);



}
