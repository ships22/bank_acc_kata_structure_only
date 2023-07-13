package main.model;

import main.constant.TransactionDescription;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

    // statement id
    private long statementId;
    // transaction date
    private Date date;
    // withdraw / deposit amount
    private BigDecimal amount;
    // withdraw / deposit description
    private TransactionDescription description;
    // account id
    private long accountId;

    public long getStatementId() {
        return statementId;
    }

    public void setStatementId(long statementId) {
        this.statementId = statementId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public long getAccountId() {
        return accountId;
    }

    public TransactionDescription getDescription() {
        return description;
    }

    public void setDescription(TransactionDescription description) {
        this.description = description;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "statementId=" + statementId +
                ", date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", accountId=" + accountId +
                '}';
    }
}
