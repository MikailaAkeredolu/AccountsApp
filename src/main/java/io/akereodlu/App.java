package io.akereodlu;

/**
 * Created by mikailaakeredolu on 5/15/16.
 */
public class App {
    public static void main(String[] args) {
        Accounts accounts = new Accounts("Black Jack Johnson",AccountType.CHECKING,Status.OPEN,100.0,OverDraft.ENABBLED);
        accounts.addTransactions(AccountType.CHECKING,10.0,"debit");
    }
}
