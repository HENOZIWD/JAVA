package edu.pnu.collection;

import java.lang.Object;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public int currentSize() {
        return size;
    }

    public T get(int i) {
        if (i < size)
            return (T) data[i];
        else
            return null;
    }

    public void add(T addObj) {
        data[size] = addObj;
        size++;
    }

    public void reset() {
        size = 0;
    }

    public GenericList() {
        data = new Object[DEFAULT_SIZE];
    }

    public GenericList(int s) {
        data = new Object[s];
    }
}
