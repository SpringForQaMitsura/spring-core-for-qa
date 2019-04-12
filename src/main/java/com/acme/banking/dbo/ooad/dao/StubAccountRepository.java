package com.acme.banking.dbo.ooad.dao;

import com.acme.banking.dbo.ooad.domain.Withdrawble;

public class StubAccountRepository {
    public Withdrawble getAccountFromDbMock(){
        return new Withdrawble() {
            @Override
            public void withdraw(double amount) {

            }
        };
    }
}
