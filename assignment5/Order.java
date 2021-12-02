package com.cafe.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public void add(OrderItem item) {
        items.add(item);
    }

    public int cost() {
        int sum = 0;
        for (OrderItem item : items) {
            sum += item.cost();
        }

        return sum;
    }

    public boolean setSize(String beverageName, String orderedSize) {
        for (OrderItem item : items) {
            if (beverageName.equals(item.name())) {
                return item.setSize(orderedSize);
            }
        }
        return false;
    }

    public void print() {
        for (OrderItem item : items) {
            System.out.println(item);
        }

        System.out.printf("Total: %,d%n", this.cost());
    }
}