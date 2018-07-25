package com.company.product;

public class ProductBuilder {
    String id;
    String seller;
    int qty;
    String[] service;

    public ProductBuilder(String id, String seller) {
        this.id = id;
        this.seller = seller;

    }

    public ProductBuilder qty(int qty) {
        this.qty = qty;
        return this;
    }

    public ProductBuilder services(String... service) {
        this.service = service;
        return this;
    }


    public AbstractProduct build() {
        if (id.startsWith("id"))
            return new Goods(this);
        else
            return new Service(this);
    }


}
