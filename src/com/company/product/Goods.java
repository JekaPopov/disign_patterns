package com.company.product;

public class Goods extends AbstractProduct implements Report {


    Goods(ProductBuilder builder) {
        super(builder);
        qty = qty == 0 ? 1 : qty;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public String getSeller() {
        return seller;
    }

    @Override
    public int getQty() {
        return qty;
    }

    @Override
    public String[] getServiceId() {
        return service;
    }

}
