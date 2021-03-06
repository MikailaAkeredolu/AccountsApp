package io.akeredolu;

import io.akereodlu.AccountType;
import io.akereodlu.Accounts;
import io.akereodlu.OverDraft;
import io.akereodlu.Status;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mikailaakeredolu on 5/7/16.
 *  Accounts(AccountType accType, long accNumber, Status status, double bal, String ovD)
 */
public class AccountsSpec {

    @Test
    public void getBalanceTestOPEN(){
<<<<<<< HEAD
        Accounts testAccount1 = new Accounts("Mike",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
=======
        Accounts testAccount1 = new Accounts(1,"Mike",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
>>>>>>> methodsStubbed
        double expectedValue = testAccount1.getBalance();
        double actualValue = 100.0;
        Assert.assertEquals(expectedValue,actualValue,.01);
    }

    @Test
    public void getBalanceTestClosed(){
<<<<<<< HEAD
        Accounts testAccount2 = new Accounts("Jones",AccountType.SAVINGS,Status.CLOSED,100.0, OverDraft.AUTOMATIC);
=======
        Accounts testAccount2 = new Accounts(2,"Jones",AccountType.SAVINGS,Status.CLOSED,100.0, OverDraft.AUTOMATIC);
>>>>>>> methodsStubbed
        double expectedValue = testAccount2.getBalance();
        double actualValue = 0;
        Assert.assertEquals(expectedValue,actualValue,.01);
    }

    @Test
    public void getBalanceTestFrozen(){
<<<<<<< HEAD
        Accounts testAccount3 = new Accounts("Christopher Wallace",AccountType.INVESTMENT,Status.FROZEN,100.0, OverDraft.ENABLED);
=======
        Accounts testAccount3 = new Accounts(3,"Christopher Wallace",AccountType.INVESTMENT,Status.FROZEN,100.0, OverDraft.ENABBLED);
>>>>>>> methodsStubbed
        double expectedValue = testAccount3.getBalance();
        double actualValue = 0;
        Assert.assertEquals(expectedValue,actualValue,.01);
    }

    @Test
    public void deductDebitFromAccountTest(){
<<<<<<< HEAD
        Accounts testAccount4 = new Accounts("Bobby Digital",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
=======
        Accounts testAccount4 = new Accounts(4,"Bobby Digital",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
>>>>>>> methodsStubbed
        double expectedValue = testAccount4.deductDebitFromAccount(20.0);
        double actualValue = 80.0;
        Assert.assertEquals(expectedValue,actualValue,.01);
    }

    @Test
    public void addCreditToAccountTest(){
<<<<<<< HEAD
        Accounts testAccount5 = new Accounts("Jack Johnson",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
=======
        Accounts testAccount5 = new Accounts(5,"Jack Johnson",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
>>>>>>> methodsStubbed
        double expectedValue = testAccount5.addCreditToAccount(30.0);
        double actualValue = 130.0;
        Assert.assertEquals(expectedValue,actualValue,.01);
    }

    @Test
    public void changeAccountHoldersnameTest(){
<<<<<<< HEAD
        Accounts testAccount6 = new Accounts("lulu",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
=======
        Accounts testAccount6 = new Accounts(6,"lulu",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
>>>>>>> methodsStubbed
        String expectedValue = testAccount6.changeAccountHoldersname("Rza");
        String actualValue = "Rza";
        Assert.assertEquals("The name should now be Rza",expectedValue,actualValue);
    }

    @Test
    public void reOpenAccountTest(){
<<<<<<< HEAD
        Accounts testAccount7 = new Accounts("Black Johnson",AccountType.CHECKING,Status.FROZEN,100.0, OverDraft.DISABLED);
=======
        Accounts testAccount7 = new Accounts(7,"Black Johnson",AccountType.CHECKING,Status.FROZEN,100.0, OverDraft.DISABLED);
>>>>>>> methodsStubbed
        Status expectedValue = testAccount7.reOpenAccount(Status.FROZEN);
        Status actualValue = Status.OPEN;
        Assert.assertEquals(expectedValue,actualValue);
    }
<<<<<<< HEAD
=======

    @Test
    public void closeAccountTest(){
        Accounts testAccount8 = new Accounts(8,"OG Bobby Johnson",AccountType.CHECKING,Status.OPEN,0.0, OverDraft.AUTOMATIC);
        Status expectedValue = testAccount8.closeAccount();
        Status actualValue = Status.CLOSED;
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void overDrawTest(){
        Accounts testAccount9 = new Accounts(9,"OG Bobby Johnson",AccountType.CHECKING,Status.OPEN,0.1, OverDraft.AUTOMATIC);
        double expectedValue = testAccount9.overDraw(OverDraft.ENABBLED,100.0);
        double actualValue = testAccount9.getBalance();
        Assert.assertEquals(expectedValue,actualValue,.01);

    }

    @Test
    public void interestRateTest(){
        Accounts testAccount10 = new Accounts(10,"OG Bobby Johnson",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
        double expectedValue = testAccount10.calculateInterest();
        double actualValue = testAccount10.getBalance();
        Assert.assertEquals(expectedValue,actualValue,.01);
    }

    @Test
    public void transferFundTest(){
        Accounts testTransfer1 = new Accounts(11,"OG Bobby Johnson",AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
        Accounts testTransfer2 = new Accounts(12,"OG Bobby Johnson",AccountType.SAVINGS,Status.OPEN,50.0, OverDraft.AUTOMATIC);


    }
>>>>>>> methodsStubbed

    @Test
    public void closeAccountTest(){
        Accounts testAccount8 = new Accounts("OG Bobby Johnson",AccountType.CHECKING,Status.OPEN,0.0, OverDraft.AUTOMATIC);
        Status expectedValue = testAccount8.closeAccount();
        Status actualValue = Status.CLOSED;
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void overDrawTest(){
        Accounts testAccount9 = new Accounts("OG Bobby Johnson",AccountType.CHECKING,Status.OPEN,0.1, OverDraft.AUTOMATIC);
        double expectedValue = testAccount9.overDraw(OverDraft.ENABLED,100.0);
        double actualValue = testAccount9.getBalance();
        Assert.assertEquals(expectedValue,actualValue,.01);

    }

}
