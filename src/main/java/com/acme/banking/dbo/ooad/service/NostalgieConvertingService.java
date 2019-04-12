package com.acme.banking.dbo.ooad.service;

public class NostalgieConvertingService implements ConvertingService {
    private double rate;

    public double convert(double from){
        return rate * from;
    };

    public NostalgieConvertingService(int rate) {
        this.rate = rate;
    }
}
