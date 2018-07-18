package com.company.secondSaler.firstSaler;

import com.company.firstSaler.FirstDeliveryHelper;
import com.company.firstSaler.FirstDocHelper;
import com.company.firstSaler.FirstPriceHelper;
import com.company.inteface.DeliveryHelper;
import com.company.inteface.DocHelper;
import com.company.inteface.PriceHelper;
import com.company.inteface.ProductFactory;

public class SecondFactory implements ProductFactory {
    @Override
    public PriceHelper createPriceHelper() {
        return new SecondPriceHelper();
    }

    @Override
    public DocHelper createDocHelper() {
        return new SecondDocHelper();
    }

    @Override
    public DeliveryHelper createDeliveryHelper() {
        return new SecondDeliveryHelper();
    }
}
