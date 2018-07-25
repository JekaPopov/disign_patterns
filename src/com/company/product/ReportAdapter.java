package com.company.product;

public class ReportAdapter implements Report{
    private Service service;

    public ReportAdapter( Service service) {
        this.service = service;
    }


    @Override
    public int getQty() {
        return 1;
    }

    @Override
    public String[] getServiceId() {
        return new String[0];
    }
}
