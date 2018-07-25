package com.company;

import com.company.inteface.ProductFactory;
import com.company.product.*;

public class Main {

    private static Settings mSettings;
    private static AbstractProduct[] goods = new AbstractProduct[10];

    public static void main(String[] args) {
        // write your code here

        mSettings = Settings.newInstanse();

        for (int i = 0; i < goods.length; i++) {

            goods[i] = new ProductBuilder(i % 2 == 0 ? "id" + i : "№" + i, i % 2 == 0 ? "second" : "first")
                    .services(i % 2 == 0 ? new String[]{"service", "service2"} : new String[]{"service1"})
                    .qty(i)
                    .build();
        }


        for (AbstractProduct goods : goods) {
            ProductFactory productFactory = mSettings.getFactory(goods.getSeller());
            System.out.println(productFactory.createDocHelper().getReport(goods.getId()));
            System.out.println(productFactory.createDeliveryHelper().getDeliveryTime("Москва"));

            if (goods instanceof Report) {
                System.out.println(productFactory.createPriceHelper().getPrice((Report)goods));
            } else {
                System.out.println(productFactory.createPriceHelper().getPrice(new ReportAdapter(((Service)goods))));
            }
        }


    }
}
