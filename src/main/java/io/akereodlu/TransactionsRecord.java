package io.akereodlu;

/**
 * Created by mikailaakeredolu on 5/14/16.
 */
public class TransactionsRecord {

    //Track transaction such as width,deposits,transfers,changes to status,name,interest rate

    private AccountType typeOfTransactionAccount;
    private double transactionAmount;
    String transactionAction;

    public TransactionsRecord(AccountType typeOfTransAcc, double transAmount,String transAction){
        this.typeOfTransactionAccount = typeOfTransAcc;
        this.transactionAmount = transAmount;
        this.transactionAction = transAction;
    }
}
