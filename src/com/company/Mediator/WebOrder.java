package com.company.Mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebOrder implements Order {

    private final List<OrderMember> members;

    public WebOrder() {
        members = new ArrayList<>();
    }

    @Override
    public void act(OrderMember actor, Action action) {
        for (OrderMember member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }

    @Override
    public void addGoods(OrderMember member) {
        members.add(member);
        member.addToOrder(this);
    }

    public void addGoods(OrderMember members[]) {
        for (OrderMember member : members) {
            this.members.add(member);
            member.addToOrder(this);
        }
    }
}

