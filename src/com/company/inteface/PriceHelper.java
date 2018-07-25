package com.company.inteface;

import com.company.product.Report;

public interface PriceHelper {
    double getPrice(Report goods);
    int getDiscount(Report Id);
}
