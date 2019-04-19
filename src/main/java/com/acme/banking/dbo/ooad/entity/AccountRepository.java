package com.acme.banking.dbo.ooad.entity;

import java.util.Collection;

public interface AccountRepository {
    public Collection<Account> getAllAccounts();
}
