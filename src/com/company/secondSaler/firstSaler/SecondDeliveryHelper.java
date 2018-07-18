package com.company.secondSaler.firstSaler;

import com.company.inteface.DeliveryHelper;

public class SecondDeliveryHelper implements DeliveryHelper {


    @Override
    public int getDeliveryTime(String address) {
        return 20;
    }

    @Override
    public float getDeliveryPrice(String address) {
        return 200;
    }
}
