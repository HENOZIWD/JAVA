package com.cafe.menu;

public class Blended extends Beverage {
    private int baseAmount = GRANDE;

    public Blended(String beverageName) {
        name = beverageName;
        basePrice = 6300;
        setSize(baseAmount);
    }

    public boolean setSize(int size) {
        if (size == GRANDE) {
            super.setSize(size);
            return true;
        }
        return false;
    }
}
