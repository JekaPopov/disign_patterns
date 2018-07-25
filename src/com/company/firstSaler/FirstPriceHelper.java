package com.company.firstSaler;

import com.company.inteface.PriceHelper;
import com.company.product.Report;

public class FirstPriceHelper implements PriceHelper {


    @Override
    public double getPrice(Report goods) {
        return 150 * goods.getQty() * getDiscount(goods) / 100;
    }

    @Override
    public int getDiscount(Report goods) {
        return goods.getQty() > 3 ? 50 : goods.getQty() > 1 ? 20 : 0;
    }
}
