package com.company.product;

public abstract class  AbstractProduct {

    final String id;
    final String seller;
    final int qty;
    final String[] service;


    AbstractProduct(ProductBuilder builder) {
        id = builder.id;
        seller = builder.seller;
        qty = builder.qty;
        service = builder.service;
    }

    public abstract String getSeller();

    public abstract String getId();
}
