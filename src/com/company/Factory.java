package com.company;

import com.company.firstSaler.FirstFactory;
import com.company.inteface.ProductFactory;
import com.company.secondSaler.firstSaler.SecondFactory;

public class Factory {
    private static final String FIRST = "first";
    private static final String SECOND = "second";

    public ProductFactory createFactory(String name) throws Exception {
        switch (name)
        {
            case FIRST:
            {
                return new FirstFactory();
            }
            case  SECOND:
            {
                return new SecondFactory();
            }
            default:
                throw new Exception();
        }
    }

}
