package com.company.firstSaler;

import com.company.inteface.DeliveryHelper;
import com.company.inteface.DocHelper;
import com.company.inteface.PriceHelper;
import com.company.inteface.ProductFactory;

public class FirstFactory implements ProductFactory {
    @Override
    public PriceHelper createPriceHelper() {
        return new FirstPriceHelper();
    }

    @Override
    public DocHelper createDocHelper() {
        return new FirstDocHelper();
    }

    @Override
    public DeliveryHelper createDeliveryHelper() {
        return new FirstDeliveryHelper();
    }
}
