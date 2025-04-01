package com.errday.headfirstdesign.combining.duck.factory;

import com.errday.headfirstdesign.combining.duck.*;
import com.errday.headfirstdesign.combining.duck.adapter.Goose;
import com.errday.headfirstdesign.combining.duck.adapter.GooseAdapter;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
