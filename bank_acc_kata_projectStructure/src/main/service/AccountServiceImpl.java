package main.service;

import main.constant.TransactionDescription;
import main.model.Account;
import main.model.Transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class AccountServiceImpl implements AccountService{

    private static String ACCOUNT_NOT_AVAILABLE = "ACCOUNT_NOT_AVAILABLE";
    private static final Logger logger = Logger.getLogger("AccountServiceImpl");

    /**
     * Method to deposit in the selected account
     * @param amount
     * @param accountId
     * */
    @Override
    public String deposit(BigDecimal amount, long accountId) {
        Transaction st = new Transaction();
        st.setAmount(amount);
        st.setAccountId(accountId);
        st.setDescription(TransactionDescription.DEPOSIT);
        st.setDate(new Date());
        Account account =  getAccount(accountId);
        BigDecimal newBalance = account.getBalance().add(amount);
        account.setBalance(newBalance);
        List<Transaction> sts = account.getTransaction();
        sts.add(st);
        account.setTransaction(sts);

        // account repository update | save into transaction repository
        return amount + " " + "added into your account";
    }

    /**
     * Method to withdraw from the selected account
     * @param amount
     * @param accountId
     * */
    @Override
    public String withdraw(BigDecimal amount, long accountId) {
        Transaction st = new Transaction();
        st.setAmount(amount);
        st.setAccountId(accountId);
        st.setDescription(TransactionDescription.WITHDRAW);
        st.setDate(new Date());
        Account account = getAccount(accountId);
        BigDecimal oldBalance = account.getBalance();
        if (oldBalance.compareTo(amount) >= 0) {
            BigDecimal newBalance = oldBalance.subtract(amount);
            account.setBalance(newBalance);
            List sts = account.getTransaction();
            sts.add(st);
            account.setTransaction(sts);

            // account repository update | save into transaction repository
            return amount + " " + "withdrawn from your account";
        }else {
            return "Insufficient fund";
        }

    }

    /**
     * Get account from db / api / main.service
     * @param accountId
     * */
    @Override
    public Account getAccount(long accountId)  {
        // get from repository by id
        return new Account();
    }


}
