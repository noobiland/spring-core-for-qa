package com.acme.banking.dbo.ooad;

import com.acme.banking.dbo.ooad.entity.Account;
import com.acme.banking.dbo.ooad.entity.TestDoubleAccounts;
import com.acme.banking.dbo.ooad.service.NostalgiaXchangeService;
import com.acme.banking.dbo.ooad.service.ReportingService;

import java.util.Collection;

public class FrameworkApp {
    public static void main(String[] args) {
        ReportingService reportingService = new ReportingService(
                new NostalgiaXchangeService(),
                new TestDoubleAccounts()
        );

        Collection<Account> accounts = reportingService.getAllAccountsInUsd();


        accounts.forEach(
                a -> System.out.println(a.getOverdraft())
        );
    }

}
