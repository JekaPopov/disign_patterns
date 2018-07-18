package com.company.product;

public class Product {

    private final String id;
    private final String seller;
    private int qty;
    private String[] servisesId;

    Product(String id, String seller) {
        this.id = id;
        this.seller = seller;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setServices(String[] serviceId) {
        this.servisesId = serviceId;
    }


    public String getId() {
        return id;
    }

    public String getSeller() {
        return seller;
    }

    public int getQty() {
        return qty;
    }

    public String[] getServisesId() {
        return servisesId;
    }

}
