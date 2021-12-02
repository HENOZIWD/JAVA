package com.cafe.menu;

import java.util.Objects;

public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    String name;
    int basePrice;
    int size;
    public boolean setSize(int size) {
        basePrice += 500 * (size - this.size);
        this.size = size;
        return true;
    }

    public boolean setSize(String size) {
        if ("TALL".equals(size))
            return setSize(TALL);
        else if ("GRANDE".equals(size))
            return setSize(GRANDE);
        else if ("VENTI".equals(size))
            return setSize(VENTI);
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beverage beverage = (Beverage) o;
        return basePrice == beverage.basePrice && size == beverage.size && name.equals(beverage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, basePrice, size);
    }

    @Override
    public String toString() {
        if (size == TALL)
            return "name=" + name + ", Price=" + basePrice + ", size=TALL";
        else if (size == GRANDE)
            return "name=" + name + ", Price=" + basePrice + ", size=GRANDE";
        else if (size == VENTI)
            return "name=" + name + ", Price=" + basePrice + ", size=VENTI";
        else
            return "name=" + name + ", Price=" + basePrice + ", size=undefined";
    }

    public int cost() {
        return basePrice;
    }

    public String name() {
        return name;
    }
}
