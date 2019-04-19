package com.acme.banking.dbo.ooad.entity;

public class CheckingAccount implements Account {
    protected int id;
    protected double amount, overdraft;

    protected CheckingAccount(int id, double amount, double overdraft) {
        this.id = id;
        this.amount = amount;
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setAmount(double newAmount){
        this.amount = newAmount;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public void setOverdraft(double newOverdraft) {
        this.overdraft=newOverdraft;
    }
}
