package com.errday.headfirstdesign.combining.duck.factory;

import com.errday.headfirstdesign.combining.duck.*;
import com.errday.headfirstdesign.combining.duck.adapter.Goose;
import com.errday.headfirstdesign.combining.duck.adapter.GooseAdapter;
import com.errday.headfirstdesign.combining.duck.decorator.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseDuck() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
