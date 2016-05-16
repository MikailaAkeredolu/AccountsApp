package io.akereodlu;

import java.util.ArrayList;

/**
 * Created by mikailaakeredolu on 5/7/16.
 */
public class Accounts {

    private AccountType accountType;
    private static long accountNumber;
    private  String accountHoldersName;
    private OverDraft checkOverdraft;
    private double interestRate = 10.0;
    private double balance;
    private  double debit;
    private double credit;
    private Status status;
    private Accounts accountObject1;
    private Accounts accountObject2;

    //Method to add transactions to array list

    public Accounts(AccountType accType,String achName){
        accountNumber++;
        this.accountType = accType;
        this.accountHoldersName = achName;
    }

    //Constructor used for testing

    public Accounts(long accN,String achName, AccountType accType, Status status, double bal, OverDraft ovD){
        this.accountNumber = accN;
        this.accountHoldersName = achName;
        this.status = status;
        this.balance = bal;
        this.accountType = accType;
        this.checkOverdraft = ovD;
    }



    public String transferFunds(String accName1,String accName2, long accNum1,long accNum2, double amount){
        if((accName1 == accName2) && (accNum1 != accNum2) && (amount < balance)){
            deductDebitFromAccount(amount);
            addCreditToAccount(amount);
            return "Transaction was successful!";
        }else{
            return "Transaction was declined";
        }

    }


    //Need an ArrayList to hold transaction history

    ArrayList<Transactions>recordOfTransactions = new ArrayList<Transactions>();


    public void addTransactions(AccountType typeOfTransAcc, double transAmount ,String transAction){

        recordOfTransactions.add(new Transactions(typeOfTransAcc, transAmount,transAction));
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
           return balance;
    }

    public double addCreditToAccount(double addMoney){
        if(status == Status.OPEN){
            balance = balance + addMoney;
            approvalStatus();
            return balance;
        }else {
            denialStatus();
        }
        return balance;
    }

    public void approvalStatus(){
        System.out.println("Transaction Approved!");
    }

    public void denialStatus(){
        System.out.println("Transaction Declined!");
    }

    public String changeAccountHoldersname(String changeName){
        if(status != Status.CLOSED){
            accountHoldersName = changeName;
            return accountHoldersName;
        }
        return "Sorry this is not an active account";
    }

    public Status reOpenAccount(Status accountStatus){

        if (accountStatus == Status.FROZEN || accountStatus == Status.OPEN){
            return Status.OPEN;
        }else{
            return Status.CLOSED;
        }
    }

    public Status closeAccount(){
        if (balance <= 0 ){
            return Status.CLOSED;
        }else
       return reOpenAccount(Status.FROZEN);
    }

    public double overDraw(OverDraft choice, double debitAmount){
        if(choice == OverDraft.ENABBLED && debitAmount > balance){
            denialStatus();
            return balance;
        }else if(choice == OverDraft.ENABBLED || choice == OverDraft.AUTOMATIC && debitAmount < balance){
            return balance = balance - debitAmount;
        }else{
            return balance;
        }
    }

    public double calculateInterest(){
        balance = balance * interestRate;
        return  balance;
    }

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

