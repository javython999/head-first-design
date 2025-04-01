package com.errday.headfirstdesign.combining.duck.factory;

import com.errday.headfirstdesign.combining.duck.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createGooseDuck();
}
