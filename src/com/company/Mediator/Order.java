package com.company.Mediator;

public interface Order {

    void addGoods(OrderMember member);

    void act(OrderMember member, Action action);

}
