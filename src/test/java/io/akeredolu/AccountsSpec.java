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
        Accounts testAccount = new Accounts(AccountType.CHECKING,123,Status.OPEN,100.00, OverDraft.AUTOMATIC);
        String expectedValue = testAccount.getBalance();
        String actualValue = "100.00";
        Assert.assertEquals("My balance should be 100", expectedValue,actualValue);
    }

    @Test
    public void getBalanceTestClosed(){
        Accounts testAccount = new Accounts(AccountType.CHECKING,123,Status.CLOSED,100.00, OverDraft.AUTOMATIC);
        String expectedValue = testAccount.getBalance();
        String actualValue = "Account is closed";
        Assert.assertEquals("This account should return account is closed ", expectedValue,actualValue);
    }

    @Test
    public void getBalanceTestFrozen(){
        Accounts testAccount = new Accounts(AccountType.CHECKING,123,Status.FROZEN,100.00, OverDraft.AUTOMATIC);
        String expectedValue = testAccount.getBalance();
        String actualValue = "Sorry Account is frozen";
        Assert.assertEquals("This account should return account is frozen ", expectedValue,actualValue);
    }



}
