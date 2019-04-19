package com.acme.banking.dbo.ooad.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestDoubleAccounts implements AccountRepository {
    @Override
    public Collection<Account> getAllAccounts() {

        Account testAcc0 = new SavingAccount(0,30.0);
        Account testAcc1 = new CheckingAccount(1,30.0,10);
        Account testAcc2 = new SavingAccount(2,60.0);
        Account testAcc3 = new CheckingAccount(3,90.0,11);
        Account testAcc4 = new CheckingAccount(4,120.0,12);
        Account testAcc5 = new CheckingAccount(5,150.0,13);






        Collection<Account> testCollection = new ArrayList<>();
        testCollection.add(testAcc0);
        testCollection.add(testAcc1);
        testCollection.add(testAcc2);
        testCollection.add(testAcc3);
        testCollection.add(testAcc4);
        testCollection.add(testAcc5);

        return testCollection;
    }
}
