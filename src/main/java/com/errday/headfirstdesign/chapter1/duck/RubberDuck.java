package com.errday.headfirstdesign.chapter1.duck;

import com.errday.headfirstdesign.chapter1.duck.fly.FlyNoWay;
import com.errday.headfirstdesign.chapter1.duck.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }
}
