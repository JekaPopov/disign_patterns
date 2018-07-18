package com.company.firstSaler;

import com.company.inteface.DeliveryHelper;

public class FirstDeliveryHelper implements DeliveryHelper {


    @Override
    public int getDeliveryTime(String address) {
        return 10;
    }

    @Override
    public float getDeliveryPrice(String address) {
        return 100;
    }
}
