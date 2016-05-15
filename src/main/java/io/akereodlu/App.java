package io.akereodlu;

/**
 * Created by mikailaakeredolu on 5/14/16.
 */
public class App {

    public static void main(String[] args) {

        /*
        Accounts accountOne = new Accounts(AccountType.CHECKING,"Mike Jones");
        System.out.println(accountOne.getBalance() + "\n" + accountOne.getAccountNumber()+ "\n" + accountOne.getAccountHoldersName());

        Accounts accountTwo = new Accounts(AccountType.SAVINGS, "Rodney Dangerfield");
        System.out.println(accountTwo.getBalance() + "\n" + accountTwo.getAccountNumber()+ "\n" + accountTwo.getAccountHoldersName());
        */

        //(AccountType accType, Status status, double bal, OverDraft ovD){
        Accounts accountMan = new Accounts("Micheal Jackson",AccountType.CHECKING,Status.FROZEN,1000.0,OverDraft.ENABBLED);
        System.out.println(accountMan.deductDebitFromAccount(100.0));
        System.out.println(accountMan.addCreditToAccount(50.0));
        System.out.println(accountMan.getBalance());

    }

}
