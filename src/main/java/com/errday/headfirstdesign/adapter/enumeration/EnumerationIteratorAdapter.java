package com.errday.headfirstdesign.adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator<Object> {

    private final Enumeration<?> enumeration;

    public EnumerationIteratorAdapter(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
