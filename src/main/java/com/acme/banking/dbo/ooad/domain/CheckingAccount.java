package com.acme.banking.dbo.ooad.domain;

public class CheckingAccount extends SavingAccount {
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public CheckingAccount(long id, double creditLimit) {
        super(id);
        this.overdraft = overdraft;
    }

    @Override
    public boolean validate(double amount){
        return super.validate(amount + overdraft);
    }
}
