package com.company.product;

public class Service extends AbstractProduct {
    Service(ProductBuilder builder) {
        super(builder);
        qty = 0;
    }

    public String getId() {
        return id;
    }

    public String getSeller() {
        return seller;
    }

}
