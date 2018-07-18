package com.company.firstSaler;

import com.company.inteface.PriceHelper;
import com.company.product.Product;

public class FirstPriceHelper implements PriceHelper{


    @Override
    public double getPrice(Product product) {
        return 150*product.getQty()*getDiscount(product)/100;
    }

    @Override
    public int getDiscount(Product product) {
        return product.getQty()>3?50:product.getQty()>1?20:0;
    }
}
