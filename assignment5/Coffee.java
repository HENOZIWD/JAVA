package com.cafe.menu;

public class Coffee extends Beverage {
    private int defaultShot = TALL;

    public Coffee(String beverageName) {
        name = beverageName;
        basePrice = 4100;
        setSize(defaultShot);
    }
}
