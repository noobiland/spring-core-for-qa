package com.acme.banking.dbo.ooad.service;

import com.acme.banking.dbo.ooad.entity.Account;
import com.acme.banking.dbo.ooad.entity.AccountRepository;

import java.util.Collection;

public class ReportingService {
    private XchangeService xchangeService;
    private AccountRepository repository;

    public ReportingService(XchangeService xchangeService, AccountRepository repository) {
        this.repository = repository;
        this.xchangeService = xchangeService;
    }


    public Collection<Account> getAllAccountsInUsd() {

        Collection<Account> c = repository.getAllAccounts();

        c.forEach(account -> account.setAmount(account.getAmount() / xchangeService.getRate()));
        c.forEach(account -> account.setOverdraft(account.getAmount() / xchangeService.getRate()));
        return c;
    }
}
