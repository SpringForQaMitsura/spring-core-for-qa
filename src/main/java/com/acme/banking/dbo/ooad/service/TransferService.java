package com.acme.banking.dbo.ooad.service;

import com.acme.banking.dbo.ooad.dao.StubAccountRepository;
import com.acme.banking.dbo.ooad.domain.Withdrawble;

public class TransferService {
    private ConvertingService convertingService;
    private StubAccountRepository stubAccountRepository;

    public TransferService(ConvertingService convertingService, StubAccountRepository stubAccountRepository) {
        this.convertingService = convertingService;
        this.stubAccountRepository = stubAccountRepository;

    }

    public void withdraw (Withdrawble from, double amount){
        from.withdraw(amount);
    }

    public double exchange (){
        return convertingService.convert(1L);
    }
}
