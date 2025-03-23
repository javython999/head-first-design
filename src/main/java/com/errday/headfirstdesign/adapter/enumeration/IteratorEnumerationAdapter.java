package com.errday.headfirstdesign.adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationAdapter implements Enumeration<Object> {

    private final Iterator<?> iterator;

    public IteratorEnumerationAdapter(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
