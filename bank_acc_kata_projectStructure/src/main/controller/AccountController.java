package main.controller;

import main.service.AccountService;

import java.math.BigDecimal;

public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * Controller method to deposit
     * @param amount
     * @param accountId
     * */
    public String deposit(BigDecimal amount, long accountId){
        return accountService.deposit(amount, accountId);
    }

    /**
     * Controller method to withdraw
     * @param amount
     * @param accountId
     * */
    public String withdraw(BigDecimal amount, long accountId){
        return accountService.withdraw(amount, accountId);
    }

}
