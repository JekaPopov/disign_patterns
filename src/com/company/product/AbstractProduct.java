package com.company.product;

import com.company.Mediator.Action;
import com.company.Mediator.Order;
import com.company.Mediator.OrderMember;

import java.util.Arrays;

public abstract class AbstractProduct implements OrderMember {

    protected final String id;
    protected final String seller;
    protected int qty;
    protected final String[] service;
    protected Order order;


    AbstractProduct(ProductBuilder builder) {
        id = builder.id;
        seller = builder.seller;
        qty = builder.qty;
        service = builder.service;
    }

    public abstract String getSeller();

    public abstract String getId();


    @Override
    public void addToOrder(Order order) {
        this.order = order;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (order != null) {
            System.out.println(this.toString() + action.toString());
            order.act(this, action);
        }
    }



    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", seller='" + seller + '\'' +
                ", qty=" + qty +
                ", service=" + Arrays.toString(service);
    }

}
