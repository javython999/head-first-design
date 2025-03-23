package com.errday.headfirstdesign.adapter;

import com.errday.headfirstdesign.adapter.enumeration.IteratorEnumerationAdapter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

class AdapterTest {

    @Test
    void TurkeyAdapterTest() {
        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

    @Test
    void DuckAdapterTest() {
        Duck wildDuck = new WildDuck();
        DuckAdapter duckAdapter = new DuckAdapter(wildDuck);

        duckAdapter.gobble();
        duckAdapter.fly();
    }

    @Test
    void iteratorEnumerationTest() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        IteratorEnumerationAdapter iteratorEnumerationAdapter = new IteratorEnumerationAdapter(strings.iterator());
        System.out.println(iteratorEnumerationAdapter.hasMoreElements());
        System.out.println(iteratorEnumerationAdapter.nextElement());
    }

}