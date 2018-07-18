package com.company;

import com.company.inteface.ProductFactory;
import com.company.product.Product;
import com.company.product.ProductBuilder;

public class Main {

    private static Settings mSettings;
    private static Product[] products = new Product[5];

    public static void main(String[] args) {
        // write your code here

        mSettings = Settings.newInstanse();

        for (int i = 0; i < 5; i++) {

            products[i] = new ProductBuilder("id" + i, i % 2 == 0 ? "second" : "first")
                    .services(i % 2 == 0 ? new String[]{"service", "service2"} : new String[]{"service1"})
                    .qty(i)
                    .build();
        }

        for (Product product :products)
        {
            ProductFactory productFactory = mSettings.getFactory(product.getSeller());
            System.out.println(productFactory.createPriceHelper().getPrice(product));
            System.out.println(productFactory.createDocHelper().getReport(product.getId()));
            System.out.println(productFactory.createDeliveryHelper().getDeliveryTime("Москва"));
        }


    }
}
