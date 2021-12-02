package com.cafe.order;

import com.cafe.menu.*;

public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage OrderedBeverage, int OrderedQuantity) {
        beverage = OrderedBeverage;
        quantity = OrderedQuantity;
    }

    @Override
    public String toString() {
        return "[ " + beverage.toString() + ", quantity=" + quantity + " ]";
    }

    public int cost() {
        return quantity * beverage.cost();
    }

    public String name() {
        return beverage.name();
    }

    public boolean setSize(String size) {
        return beverage.setSize(size);
    }
}
