package com.company.inteface;

import com.company.product.Product;

public interface PriceHelper {
    double getPrice(Product product);
    int getDiscount(Product Id);
}
