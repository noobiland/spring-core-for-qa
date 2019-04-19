package com.acme.banking.dbo.ooad.entity;

public interface Account {
    //void withdraw(double amount);
    public double getOverdraft();
    public void setAmount(double amount);
    public double getAmount();

    void setOverdraft(double newOverdraft);
}
