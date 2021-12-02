package com.cafe.menu;

public class Teavana extends Beverage {
    private int amount = TALL;

    public Teavana(String beverageName) {
        name = beverageName;
        basePrice = 4100;
        setSize(amount);
    }

    public boolean setSize(int size) {
        if (size != GRANDE) {
            super.setSize(size);
            return true;
        }
        return false;
    }
}
