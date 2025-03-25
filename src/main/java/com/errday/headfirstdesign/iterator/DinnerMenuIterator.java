package com.errday.headfirstdesign.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] items;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("menu can not be removed");
    }
}
