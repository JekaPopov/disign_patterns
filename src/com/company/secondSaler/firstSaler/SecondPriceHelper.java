package com.company.secondSaler.firstSaler;

import com.company.inteface.PriceHelper;
import com.company.product.Product;

public class SecondPriceHelper implements PriceHelper {


    @Override
    public double getPrice(Product product) {
        return 200 * product.getQty() + 10 * product.getServisesId().length + getDiscount(product)/100;
    }

    @Override
    public int getDiscount(Product product) {

        return product.getServisesId().length > 1 ? 20 : 10;
    }
}
