package com.acme.banking.dbo.ooad.entity;

public class SavingAccount extends CheckingAccount {

    public SavingAccount(int id, double amount) {
        super(id, amount, 0);
    }

    @Override
    public double getOverdraft() {
        return super.getOverdraft();
    }

    @Override
    public void setAmount(double newAmount) {
        super.setAmount(newAmount);
    }

    @Override
    public void setOverdraft(double newOverdraft) {};
}
