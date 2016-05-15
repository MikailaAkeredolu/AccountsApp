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
        Accounts testAccount1 = new Accounts(AccountType.CHECKING,Status.OPEN,100.0, OverDraft.AUTOMATIC);
        double expectedValue = testAccount1.getBalance();
        double actualValue = 100.0;
        Assert.assertEquals(expectedValue,actualValue,0.1);
    }

    @Test
    public void getBalanceTestClosed(){
        Accounts testAccount2 = new Accounts(AccountType.CHECKING,Status.CLOSED,100.0, OverDraft.AUTOMATIC);
        double expectedValue = testAccount2.getBalance();
        double actualValue = 0;
        Assert.assertEquals(expectedValue,actualValue,0.1);
    }

    @Test
    public void getBalanceTestFrozen(){
        Accounts testAccount3 = new Accounts(AccountType.CHECKING,Status.FROZEN,100.0, OverDraft.AUTOMATIC);
        double expectedValue = testAccount3.getBalance();
        double actualValue = 0;
        Assert.assertEquals(expectedValue,actualValue,0.1);
    }


}
