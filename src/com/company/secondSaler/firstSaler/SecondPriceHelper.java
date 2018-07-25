package com.company.secondSaler.firstSaler;

import com.company.inteface.PriceHelper;
import com.company.product.Goods;
import com.company.product.Report;

public class SecondPriceHelper implements PriceHelper {


    @Override
    public double getPrice(Report goods) {
        return 200 * goods.getQty() + 10 * goods.getServiceId().length + getDiscount(goods)/100;
    }

    @Override
    public int getDiscount(Report goods) {

        return goods.getServiceId().length > 1 ? 20 : 10;
    }
}
