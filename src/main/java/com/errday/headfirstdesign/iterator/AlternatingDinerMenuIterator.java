package com.errday.headfirstdesign.iterator;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
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
        position += 2;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("menu can not be removed");
    }
}
