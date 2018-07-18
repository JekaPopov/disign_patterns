package com.company.product;

public class ProductBuilder {
    private Product product;

    public ProductBuilder(String id, String seller)
    {
        product = new Product(id,seller);
    }

    public ProductBuilder qty(int qty)
    {
        product.setQty(qty);
        return this;
    }

    public ProductBuilder services (String ... serviceId)
    {
        product.setServices(serviceId);
        return this;
    }

    public Product build() {
        return product;
    }


}
