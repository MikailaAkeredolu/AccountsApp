package io.akereodlu;

import io.akereodlu.AccountType;
import io.akereodlu.Accounts;

/**
 * Created by mikailaakeredolu on 5/15/16.
 */
public class Transactions {

    private AccountType typeOfTransactionAccount;
    private double transactionAmount;
    String transactionAction;

    public Transactions(AccountType typeOfTransAcc, double transAmount,String transAction){
        this.typeOfTransactionAccount = typeOfTransAcc;
        this.transactionAmount = transAmount;
        this.transactionAction = transAction;
    }
}
