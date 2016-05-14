package io.akereodlu;

/**
 * Created by mikailaakeredolu on 5/7/16.
 */
public class Accounts {

    private AccountType accountType;
    private long accountNumber;
    private  String accountHoldersName;
    OverDraft checkOverdraft;
    private double interestRate;
    private double balance;
    private  double debit;
    private double credit;
    private Status checkStatus;

    public Accounts(AccountType accType, long accNumber){
        this.accountNumber = accNumber;
        this.accountType = accType;
    }

    public Accounts(AccountType accType, long accNumber, Status status, double bal, OverDraft ovD){
        this.checkStatus = status;
        this.balance = bal;
        this.accountType = accType;
        this.accountNumber = accNumber;
        this.checkOverdraft = ovD;

    }

    public OverDraft getOverDraft() {

        return checkOverdraft;
    }

    public void setOverDraft(OverDraft overDraft) {
        this.checkOverdraft = overDraft;
    }


    public void deducctDebit(){

    }

    public void addCredit(){

    }

    public Status getCheckStatus() {
        return checkStatus;
    }

    public String getBalance() {
       // return Double.toString(balance);
        return "100.00";
    }


}
