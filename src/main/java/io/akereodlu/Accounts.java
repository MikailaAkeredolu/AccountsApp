package io.akereodlu;

import java.util.ArrayList;

/**
 * Created by mikailaakeredolu on 5/7/16.
 */
public class Accounts {

    private AccountType accountType;
    private static long accountNumber;
    private  String accountHoldersName;
    OverDraft checkOverdraft;
    private double interestRate;
    private double balance;
    private  double debit;
    private double credit;
    private Status status;

    //Account number and account type set during account creation
    //Need an ArrayList to hold transaction history
    
    public Accounts(AccountType accType,String achName){
        accountNumber++;
        this.accountType = accType;
        this.accountHoldersName = achName;
    }

    //Constructor used for testing

    public Accounts(AccountType accType, Status status, double bal, OverDraft ovD){
        this.status = status;
        this.balance = bal;
        this.accountType = accType;
        this.checkOverdraft = ovD;

    }

    //Methods

    public double getBalance()
    {
        if(status != Status.OPEN){
            System.out.println("This is NOT an active account");
            return 0;
        }
        return balance;
    }

    //return Double.toString(balance);


    public double deductDebitFromAccount(double removeMoney){
        if(status == Status.OPEN){
            balance =  balance - removeMoney;
            approvalStatus();
            return balance;
        }else {
            denialStatus();
        }
           return 0;
    }

    public double addCreditToAccount(double addMoney){
        if(status == Status.OPEN){
            balance = balance + addMoney;
            approvalStatus();
            return balance;
        }else {
            denialStatus();
        }
        return 0;
    }

    public void approvalStatus(){
        System.out.println("Transaction Approved!");
    }

    public void denialStatus(){
        System.out.println("Transaction Declined!");
    }

    /*
    public  transferFundsFromSameAccountHolder(Accounts acct1, Accounts acct2){
        if((acct1.accountHoldersName == acct2.accountHoldersName) && (acct1.accountNumber != acct2. accountNumber)){

        }
        acct1.deductDebitFromAccount()
        acct2.addCreditToAccount()
    }
    */

    //Getters and Setters
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public OverDraft getOverDraft() {

        return checkOverdraft;
    }

    public void setOverDraft(OverDraft overDraft) {
        this.checkOverdraft = overDraft;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public void setAccountHoldersName(String accountHoldersName) {
        this.accountHoldersName = accountHoldersName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public static long getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(long accountNumber) {
        Accounts.accountNumber = accountNumber;
    }
}

