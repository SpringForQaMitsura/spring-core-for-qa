package com.acme.banking.dbo.ooad.domain;

import com.acme.banking.dbo.legacy.domain.AccountType;

/** Structure modeled with class: no behavior encapsulated */
public class SavingAccount implements Withdrawble {
    private long id;
    private double amount;


    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public SavingAccount(long id) {
        this.id = id;
        this.amount = amount;
    }


    @Override
    public void withdraw (double amount){
        if (validate(amount))
            throw new IllegalStateException("Not enough");

        this.amount -= amount;
    }

    public boolean validate (double amount){
        return amount > this.amount;
    }

}
