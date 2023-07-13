package main.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {

    // account id
    private long accountId;
    // account balance
    private BigDecimal balance = new BigDecimal(0);
    // transactions
    private List<Transaction> transaction = new ArrayList<>();

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", transaction=" + transaction +
                '}';
    }
}
